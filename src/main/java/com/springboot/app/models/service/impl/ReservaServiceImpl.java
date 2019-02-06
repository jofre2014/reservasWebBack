package com.springboot.app.models.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.app.components.IAuthenticationFacade;
import com.springboot.app.dto.ReservaDTO;
import com.springboot.app.dto.VoucherProductoDTO;
import com.springboot.app.models.dao.IArticuloDao;
import com.springboot.app.models.dao.IGrupoCupoDao;
import com.springboot.app.models.dao.IProductoArticuloDao;
import com.springboot.app.models.dao.IReservaArticuloDao;
import com.springboot.app.models.dao.IReservaDao;
import com.springboot.app.models.dao.IVoucherDao;
import com.springboot.app.models.dao.IVoucherPaxDao;
import com.springboot.app.models.dao.IVoucherProductoDao;
import com.springboot.app.models.entity.Articulo;
import com.springboot.app.models.entity.Hotel;
import com.springboot.app.models.entity.Producto;
import com.springboot.app.models.entity.Reserva;
import com.springboot.app.models.entity.ReservaArticulo;
import com.springboot.app.models.entity.Voucher;
import com.springboot.app.models.entity.VoucherPax;
import com.springboot.app.models.entity.VoucherProducto;
import com.springboot.app.models.service.IGrupoCupoService;
import com.springboot.app.models.service.IReservaService;

/**
 *
 * @author Jose
 */
@Service
@Transactional(readOnly = true)
public class ReservaServiceImpl implements IReservaService {

	private Voucher voucher;
	private Reserva newReserva;

	private VoucherProducto newVoucherProd;
	private VoucherPax voucherPax;

	private List<VoucherProducto> voucherProd;

	private List<ReservaArticulo> reservaArticulo;

	private int cantidadPaxs = 0;
	private boolean first;
	private StringBuilder cadenaResumenProd;
	private Map<Integer, String> listProd;
	private Map<Integer, Integer> actualizaCupo;

	@Autowired
	IReservaDao iReservaDao;

	@Autowired
	IVoucherDao iVoucherDao;

	@Autowired
	IVoucherProductoDao iVoucherProductoDao;

	@Autowired
	IVoucherPaxDao iVoucherPaxDao;

	@Autowired
	IAuthenticationFacade iAuthenticationFacade;

	@Autowired
	IProductoArticuloDao iProductoArticuloDao;

	@Autowired
	IArticuloDao iArticuloDao;

	@Autowired
	IReservaArticuloDao iReservaArticuloDao;
		
	@Autowired IGrupoCupoDao iGrupoCupoDao;
	
	@Autowired IGrupoCupoService iGrupoCupoService;
	
	@Override
	public List<Reserva> findAll() {
		return iReservaDao.findAll();
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean generarReserva(List<ReservaDTO> datosReserva) {
		this.cadenaResumenProd = new StringBuilder();
		this.voucher = new Voucher();
		newReserva = new Reserva();
		this.listProd = new HashMap<Integer, String>();

		this.actualizaCupo = new HashMap<Integer, Integer>();

		voucherProd = new ArrayList<VoucherProducto>();
		reservaArticulo = new ArrayList<ReservaArticulo>();

		cantidadPaxs = datosReserva.size();

		// Registrar Voucher(Solo necesito el primer objeto de la lista)
		registrarVoucher(datosReserva.get(0));
		iVoucherDao.save(this.voucher);

		// Registrar Reserva
		registrarReserva(datosReserva.get(0));
		this.newReserva.setCantidadpaxs((short) cantidadPaxs);
		iReservaDao.save(this.newReserva);

		// Registrar VoucherPax
		datosReserva.stream().forEach(res -> {
			registrarVoucherPax(res);
		});

		obtenerCadenaResumen(this.listProd);

		// Actualizo atributo voucher
		this.voucher.setVoucherID(this.voucher.getVoucherID());
		this.voucher.setCantidadpaxs((short) cantidadPaxs);
		this.voucher.setReservaID(this.newReserva.getReservaID());
		this.voucher.setProductos(cadenaResumenProd.toString());
		iVoucherDao.save(this.voucher);

		// Crea lista Agrupada por Producto y contabiliza cantidad de pasajeros.
		List<VoucherProducto> reduceVoucherProd = this.voucherProd.stream()
				.collect(Collectors.groupingBy(vp -> vp.getProductoID())).entrySet().stream()
				.map(e -> e.getValue().stream()
						.reduce((f1, f2) -> new VoucherProducto(f1.getProductoID(), f1.getVoucherID(),
								((short) (f1.getCantidadpaxs() + f2.getCantidadpaxs())), f1.getCreated(),
								f1.getUpdated(), f1.getUuid())))
				.map(f -> f.get()).collect(Collectors.toList());

		iVoucherProductoDao.saveAll(reduceVoucherProd);

		// Registrar ReservaArticulo
		this.first = true;
		reduceVoucherProd.forEach(a -> registrarReservaArticulo(a));

		iReservaArticuloDao.saveAll(reservaArticulo);
		
		// Actualiza Cupos
		iGrupoCupoService.updateCupos(datosReserva.get(0).FechaServicio, this.actualizaCupo);
		

		return true;
	}

	private Object registrarReservaArticulo(VoucherProducto a) {

		String articuloID = iProductoArticuloDao.recuperaIdArticulo(a.getProductoID());

		Optional<Articulo> dataArticulo = iArticuloDao.findById(articuloID);

		ReservaArticulo newReservaArticulo = new ReservaArticulo();
		newReservaArticulo.setArticuloID(articuloID);
		newReservaArticulo.setCantidad(a.getCantidadpaxs());
		newReservaArticulo.setCreated(new Date());
		newReservaArticulo.setUpdated(new Date());
		newReservaArticulo.setNegocioID((short) 54); // HardCode Por ahora
		newReservaArticulo.setVoucherID(a.getVoucherID());
		newReservaArticulo.setReservaID(this.newReserva.getReservaID());
		newReservaArticulo.setComision(dataArticulo.get().getComision());
		newReservaArticulo.setPreciounitariosincomision(dataArticulo.get().getPrecioventaconiva());

		double precioUnitario = dataArticulo.get().getPrecioventaconiva() * (1 - dataArticulo.get().getComision());
		newReservaArticulo.setPreciounitario(precioUnitario);
		newReservaArticulo.setUuid("");

		String obs = this.first == false ? ""
				: "RVA " + this.newReserva.getReservaID() + " " + this.voucher.getNombrepax() + " x "
						+ this.voucher.getCantidadpaxs() + " " + this.voucher.getProductos() + " "
						+ this.voucher.getFechaservicio();
		newReservaArticulo.setObservaciones(obs);

		System.out.println("Verificacion datos objeto newREservaArticulo");
		printObjToJSON(newReservaArticulo);

		reservaArticulo.add(newReservaArticulo);

		this.first = false;
		return null;
	}

	private void registrarVoucherPax(ReservaDTO reserva) {

		// Cargo datos para VoucherProducto
		newVoucherProd = new VoucherProducto();

		newVoucherProd.setVoucherID(this.voucher.getVoucherID());
		newVoucherProd.setUpdated(new Date());
		newVoucherProd.setCreated(new Date());
		newVoucherProd.setProductoID((short) reserva.getProducto().getProductoID());
		newVoucherProd.setCantidadpaxs((short) 1);
		newVoucherProd.setUuid("0");

		voucherProd.add(newVoucherProd);

		voucherPax = new VoucherPax();

		System.out.println("registrarVoucherPax");
		Producto prod = new Producto();
		prod = reserva.producto;

		Hotel hotel = new Hotel();
		hotel = reserva.hotel;

		Voucher voucher = new Voucher();
		voucher.setVoucherID(this.voucher.getVoucherID());

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaServicio = null;
		try {
			fechaServicio = formatter.parse(reserva.FechaServicio);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		voucherPax.setAlojado((short) (reserva.alojado == true ? 1 : 0));
		voucherPax.setApellido(reserva.apellido);
		voucherPax.setCreated(new Date());
		voucherPax.setDocumento((long) reserva.dni);
		voucherPax.setEdad((short) reserva.edad);
		voucherPax.setFechaServicio(fechaServicio);
		voucherPax.setNombre(reserva.nombre);
		voucherPax.setTelefono(reserva.telefono);
		voucherPax.setUuid("");
		voucherPax.setWhatsapp((short) (reserva.whatapp == true ? 1 : 0));
		voucherPax.setProducto(prod);
		voucherPax.setHotel(hotel);
		voucherPax.setVoucher(voucher);
		voucherPax.setUpdated(new Date());
		iVoucherPaxDao.save(voucherPax);

		printObjToJSON(voucherPax);

		// Guardo los productos sin repetirse
		if (!this.listProd.containsKey(reserva.producto.getProductoID()))
			this.listProd.put(reserva.producto.getProductoID(), reserva.producto.getNombre());
		
		// Guardo Cupos a Descontar
		this.actualizaCupo.put(reserva.getGrupo(), this.actualizaCupo.get((Integer) reserva.getGrupo()) == null ? 1
				: (this.actualizaCupo.get((Integer) reserva.getGrupo()) + 1));
		
	}

	private void obtenerCadenaResumen(Map<Integer, String> listProd) {

		listProd.forEach(
				(k, v) -> this.cadenaResumenProd.append(this.cadenaResumenProd.length() == 0 ? v : (" + " + v)));

	}

	private void registrarVoucher(ReservaDTO reserva) {
		// TODO Auto-generated method stub

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaActual = new Date();

		try {
			fechaActual = formatter.parse(fechaActual.toString());
		} catch (ParseException e) {

		}

		Date fechaServicio = null;
		try {
			fechaServicio = formatter.parse(reserva.FechaServicio);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Hora: " + hourFormat.format(new Date()));

		final java.util.Calendar fecha = GregorianCalendar.getInstance();
		fecha.setTime(new Date());

		// Voucher voucher = new Voucher();
		this.voucher.setFechatoma(fechaActual);
		this.voucher.setFechaservicio(fechaServicio);
		fecha.add(GregorianCalendar.DATE, 2);
		this.voucher.setFechavencimiento(new Date(fecha.getTime().getTime()));
		this.voucher.setHoravencimiento(null);
		this.voucher.setNombrepax(reserva.getApellido() + " " + reserva.getNombre());
		// this.voucher.setCantidadpaxs(cantidadpaxs);
//		this.voucher.setSubeen(reserva.hotel.getNombre());
		this.voucher.setSubeen("");
		this.voucher.setHotelID(reserva.hotel.getHotelID());
		this.voucher.setProductos(reserva.producto.getNombre());
		this.voucher.setPlanilla("-");
		this.voucher.setTienevoucher((short) 1);
		this.voucher.setClienteID(reserva.getCliente());
		this.voucher.setHotelID(reserva.hotel.getHotelID());
		this.voucher.setContacto(reserva.getNombreFantasia());
		this.voucher.setProveedorID(45); // id del proveedor. Por ahora VITAR
		// this.voucher.setReservaID(reservaID);
		this.voucher.setUsuario(reserva.getNombreFantasia());
		this.voucher.setReservaorigenID(10); // internet. Por ahora Hardcode
		this.voucher.setUpdated(new Date());
		this.voucher.setUuid("0");
		this.voucher.setObservaciones("-");
		this.voucher.setNumerovoucher("0");

	}

	private void registrarReserva(ReservaDTO reservaDTO) {
		// TODO Auto-generated method stub

		this.newReserva.setNegocioID((short) 4); // por el momento va hardCode
		this.newReserva.setClienteID(reservaDTO.getCliente());
		this.newReserva.setFechatoma(this.voucher.getFechatoma());
		this.newReserva.setFechainservicio(this.voucher.getFechaservicio());
		this.newReserva.setFechaoutservicio(this.voucher.getFechaservicio());
		this.newReserva.setFechavencimiento(this.voucher.getFechavencimiento());
		this.newReserva.setHoravencimiento(this.voucher.getHoravencimiento());
		this.newReserva.setPendiente((short) 1);
		this.newReserva.setConfirmada((short) reservaDTO.getConfirmada());
		this.newReserva.setFacturada((short) 0);
		this.newReserva.setAnulada((short) 0);
		this.newReserva.setEliminada((short) 0);
		this.newReserva.setVerificada((short) 0);
		this.newReserva.setNombrepax(reservaDTO.getApellido() + " " + reservaDTO.getNombre());
		this.newReserva.setVoucherID(this.voucher.getVoucherID());
		this.newReserva.setContacto(reservaDTO.getNombreFantasia());
		this.newReserva.setReservaorigenid((short) this.voucher.getReservaorigenID());
		this.newReserva.setUpdated(new Date());
		this.newReserva.setUuid("0");
		this.newReserva.setReservaarticulos("");
		this.newReserva.setObservcomision("");
		this.newReserva.setObservaciones("");
		this.newReserva.setUsuario("");

	}

	private void printObjToJSON(Object object) {
		ObjectMapper mapperObj = new ObjectMapper();
		try {
			String jsonStr = mapperObj.writeValueAsString(object);

			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Reserva> findByConfirmada(short confirmada) {

		return iReservaDao.findByConfirmada(confirmada);
	}

	@Override
	public List<Reserva> findConfirmadaXCliente(int cliente, short estado) {
		return iReservaDao.findConfirmadaXCliente(cliente, estado);
	}

}
