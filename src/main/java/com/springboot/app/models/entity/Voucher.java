/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Romina
 */
@Entity
@Table(name = "voucher")
public class Voucher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Vou_ID")
    @NotNull
    private int voucherID;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="voucher_id")
    private List<VoucherPax> voucherpax;

    @Column(name = "Vou_Fechareserva")
    private Date fechatoma;

    @Column(name = "Vou_Fechain")
    private Date fechaservicio;

    @Column(name = "Vou_Vto")
    private Date fechavencimiento;

    @Column(name = "Vou_Horavto")
    private Date horavencimiento;

    @Column(name = "Vou_Nombrepax")
    @NotNull
    @Size(max = 150)
    private String nombrepax;

    @NotNull
    @Column(name = "Vou_Paxs")
    @Digits(integer = 2, fraction = 0)
    private short cantidadpaxs;

    @NotNull
    @Column(name = "Vou_Subeen")
    @Size(max = 150)
    private String subeen;

    @NotNull
    @Column(name = "Vou_Productos")
    @Size(max = 250)
    private String productos;

    @NotNull
    @Column(name = "Vou_Voucher")
    @Digits(integer = 1, fraction = 0)
    private short tienevoucher;

    @NotNull
    @Column(name = "Vou_Cli_ID")
    @Digits(integer = 4, fraction = 0)
    private int clienteID;

    @NotNull
    @Column(name = "Vou_Observ")
    @Size(max = 250)
    private String observaciones;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    @Column(name = "Vou_Confirmado")
    private short confirmado;

    @NotNull
    @Column(name = "paga_cacheuta")
    @Digits(integer = 1, fraction = 0)
    private short pagacacheuta;

    @NotNull
    @Column(name = "Vou_Hot_ID")
    @Digits(integer = 4, fraction = 0)
    private int hotelID;

    @NotNull
    @Column(name = "Vou_Cliente")
    @Size(max = 50)
    private String contacto;

    @NotNull
    @Column(name = "Vou_Paxsreales")
    @Digits(integer = 2, fraction = 0)
    private int paxsreales;

    @NotNull
    @Column(name = "Vou_Pro_ID")
    @Digits(integer = 2, fraction = 0)
    private int proveedorID;

    @NotNull
    @Column(name = "Vou_Planilla")
    @Size(max = 30)
    private String planilla;

    @NotNull
    @Column(name = "Vou_Res_ID")
    private int reservaID;

    @NotNull
    @Column(name = "Vou_Nrovoucher")
    @Size(max = 50)
    private String numerovoucher;

    @NotNull
    @Column(name = "Vou_Usuario")
    @Size(max = 20)
    private String usuario;

    @Column(name = "Vou_Fecharecepcion")
    private Date conffecharecepcion;

    @Column(name = "Vou_Fechaemision")
    private Date conffechaemision;

    @Column(name = "Vou_Numero")
    @Size(max = 50)
    private String confnumero;

    @Column(name = "Vou_Cantidadpax")
    @Digits(integer = 2, fraction = 0)
    private int confcantidadpaxs;

    @Column(name = "Vou_Nombre")
    @Size(max = 250)
    private String confnombre;

    @Column(name = "Vou_Contraslado")
    @Digits(integer = 1, fraction = 0)
    private short confcontraslado;

    @Column(name = "Vou_Paxsnoshow")
    @Digits(integer = 2, fraction = 0)
    private int confpaxsnoshow;

    @NotNull
    @Column(name = "Vou_ReO_ID")
    @Digits(integer = 2, fraction = 0)
    private int reservaorigenID;

    @NotNull
    @Column(name = "fecha_abierta")
    @Digits(integer = 1, fraction = 0)
    private short fechaabierta;

    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;

    public Voucher() {
        super();
    }

    public int getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(int voucherID) {
        this.voucherID = voucherID;
    }

    public Date getFechatoma() {
        return fechatoma;
    }

    public void setFechatoma(Date fechatoma) {
        this.fechatoma = fechatoma;
    }

    public Date getFechaservicio() {
        return fechaservicio;
    }

    public void setFechaservicio(Date fechaservicio) {
        this.fechaservicio = fechaservicio;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Date getHoravencimiento() {
        return horavencimiento;
    }

    public void setHoravencimiento(Date horavencimiento) {
        this.horavencimiento = horavencimiento;
    }

    public String getNombrepax() {
        return nombrepax;
    }

    public void setNombrepax(String nombrepax) {
        this.nombrepax = nombrepax;
    }

    public short getCantidadpaxs() {
        return cantidadpaxs;
    }

    public void setCantidadpaxs(short cantidadpaxs) {
        this.cantidadpaxs = cantidadpaxs;
    }

    public String getSubeen() {
        return subeen;
    }

    public void setSubeen(String subeen) {
        this.subeen = subeen;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public short getTienevoucher() {
        return tienevoucher;
    }

    public void setTienevoucher(short tienevoucher) {
        this.tienevoucher = tienevoucher;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public short getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(short confirmado) {
        this.confirmado = confirmado;
    }

    public short getPagacacheuta() {
        return pagacacheuta;
    }

    public void setPagacacheuta(short pagacacheuta) {
        this.pagacacheuta = pagacacheuta;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getPaxsreales() {
        return paxsreales;
    }

    public void setPaxsreales(int paxsreales) {
        this.paxsreales = paxsreales;
    }

    public int getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(int proveedorID) {
        this.proveedorID = proveedorID;
    }

    public String getPlanilla() {
        return planilla;
    }

    public void setPlanilla(String planilla) {
        this.planilla = planilla;
    }

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }

    public String getNumerovoucher() {
        return numerovoucher;
    }

    public void setNumerovoucher(String numerovoucher) {
        this.numerovoucher = numerovoucher;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getConffecharecepcion() {
        return conffecharecepcion;
    }

    public void setConffecharecepcion(Date conffecharecepcion) {
        this.conffecharecepcion = conffecharecepcion;
    }

    public Date getConffechaemision() {
        return conffechaemision;
    }

    public void setConffechaemision(Date conffechaemision) {
        this.conffechaemision = conffechaemision;
    }

    public String getConfnumero() {
        return confnumero;
    }

    public void setConfnumero(String confnumero) {
        this.confnumero = confnumero;
    }

    public int getConfcantidadpaxs() {
        return confcantidadpaxs;
    }

    public void setConfcantidadpaxs(int confcantidadpaxs) {
        this.confcantidadpaxs = confcantidadpaxs;
    }

    public String getConfnombre() {
        return confnombre;
    }

    public void setConfnombre(String confnombre) {
        this.confnombre = confnombre;
    }

    public short getConfcontraslado() {
        return confcontraslado;
    }

    public void setConfcontraslado(short confcontraslado) {
        this.confcontraslado = confcontraslado;
    }

    public int getConfpaxsnoshow() {
        return confpaxsnoshow;
    }

    public void setConfpaxsnoshow(int confpaxsnoshow) {
        this.confpaxsnoshow = confpaxsnoshow;
    }

    public int getReservaorigenID() {
        return reservaorigenID;
    }

    public void setReservaorigenID(int reservaorigenID) {
        this.reservaorigenID = reservaorigenID;
    }

    public short getFechaabierta() {
        return fechaabierta;
    }

    public void setFechaabierta(short fechaabierta) {
        this.fechaabierta = fechaabierta;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    

    public List<VoucherPax> getVoucherpax() {
		return voucherpax;
	}

	public void setVoucherpax(List<VoucherPax> voucherpax) {
		this.voucherpax = voucherpax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadpaxs;
		result = prime * result + clienteID;
		result = prime * result + confcantidadpaxs;
		result = prime * result + confcontraslado;
		result = prime * result + ((conffechaemision == null) ? 0 : conffechaemision.hashCode());
		result = prime * result + ((conffecharecepcion == null) ? 0 : conffecharecepcion.hashCode());
		result = prime * result + confirmado;
		result = prime * result + ((confnombre == null) ? 0 : confnombre.hashCode());
		result = prime * result + ((confnumero == null) ? 0 : confnumero.hashCode());
		result = prime * result + confpaxsnoshow;
		result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + fechaabierta;
		result = prime * result + ((fechaservicio == null) ? 0 : fechaservicio.hashCode());
		result = prime * result + ((fechatoma == null) ? 0 : fechatoma.hashCode());
		result = prime * result + ((fechavencimiento == null) ? 0 : fechavencimiento.hashCode());
		result = prime * result + ((horavencimiento == null) ? 0 : horavencimiento.hashCode());
		result = prime * result + hotelID;
		result = prime * result + ((nombrepax == null) ? 0 : nombrepax.hashCode());
		result = prime * result + ((numerovoucher == null) ? 0 : numerovoucher.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + pagacacheuta;
		result = prime * result + paxsreales;
		result = prime * result + ((planilla == null) ? 0 : planilla.hashCode());
		result = prime * result + ((productos == null) ? 0 : productos.hashCode());
		result = prime * result + proveedorID;
		result = prime * result + reservaID;
		result = prime * result + reservaorigenID;
		result = prime * result + ((subeen == null) ? 0 : subeen.hashCode());
		result = prime * result + tienevoucher;
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		result = prime * result + voucherID;
		result = prime * result + ((voucherpax == null) ? 0 : voucherpax.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voucher other = (Voucher) obj;
		if (cantidadpaxs != other.cantidadpaxs)
			return false;
		if (clienteID != other.clienteID)
			return false;
		if (confcantidadpaxs != other.confcantidadpaxs)
			return false;
		if (confcontraslado != other.confcontraslado)
			return false;
		if (conffechaemision == null) {
			if (other.conffechaemision != null)
				return false;
		} else if (!conffechaemision.equals(other.conffechaemision))
			return false;
		if (conffecharecepcion == null) {
			if (other.conffecharecepcion != null)
				return false;
		} else if (!conffecharecepcion.equals(other.conffecharecepcion))
			return false;
		if (confirmado != other.confirmado)
			return false;
		if (confnombre == null) {
			if (other.confnombre != null)
				return false;
		} else if (!confnombre.equals(other.confnombre))
			return false;
		if (confnumero == null) {
			if (other.confnumero != null)
				return false;
		} else if (!confnumero.equals(other.confnumero))
			return false;
		if (confpaxsnoshow != other.confpaxsnoshow)
			return false;
		if (contacto == null) {
			if (other.contacto != null)
				return false;
		} else if (!contacto.equals(other.contacto))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (fechaabierta != other.fechaabierta)
			return false;
		if (fechaservicio == null) {
			if (other.fechaservicio != null)
				return false;
		} else if (!fechaservicio.equals(other.fechaservicio))
			return false;
		if (fechatoma == null) {
			if (other.fechatoma != null)
				return false;
		} else if (!fechatoma.equals(other.fechatoma))
			return false;
		if (fechavencimiento == null) {
			if (other.fechavencimiento != null)
				return false;
		} else if (!fechavencimiento.equals(other.fechavencimiento))
			return false;
		if (horavencimiento == null) {
			if (other.horavencimiento != null)
				return false;
		} else if (!horavencimiento.equals(other.horavencimiento))
			return false;
		if (hotelID != other.hotelID)
			return false;
		if (nombrepax == null) {
			if (other.nombrepax != null)
				return false;
		} else if (!nombrepax.equals(other.nombrepax))
			return false;
		if (numerovoucher == null) {
			if (other.numerovoucher != null)
				return false;
		} else if (!numerovoucher.equals(other.numerovoucher))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (pagacacheuta != other.pagacacheuta)
			return false;
		if (paxsreales != other.paxsreales)
			return false;
		if (planilla == null) {
			if (other.planilla != null)
				return false;
		} else if (!planilla.equals(other.planilla))
			return false;
		if (productos == null) {
			if (other.productos != null)
				return false;
		} else if (!productos.equals(other.productos))
			return false;
		if (proveedorID != other.proveedorID)
			return false;
		if (reservaID != other.reservaID)
			return false;
		if (reservaorigenID != other.reservaorigenID)
			return false;
		if (subeen == null) {
			if (other.subeen != null)
				return false;
		} else if (!subeen.equals(other.subeen))
			return false;
		if (tienevoucher != other.tienevoucher)
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		if (voucherID != other.voucherID)
			return false;
		if (voucherpax == null) {
			if (other.voucherpax != null)
				return false;
		} else if (!voucherpax.equals(other.voucherpax))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voucher [voucherID=" + voucherID + ", voucherpax=" + voucherpax + ", fechatoma=" + fechatoma
				+ ", fechaservicio=" + fechaservicio + ", fechavencimiento=" + fechavencimiento + ", horavencimiento="
				+ horavencimiento + ", nombrepax=" + nombrepax + ", cantidadpaxs=" + cantidadpaxs + ", subeen=" + subeen
				+ ", productos=" + productos + ", tienevoucher=" + tienevoucher + ", clienteID=" + clienteID
				+ ", observaciones=" + observaciones + ", confirmado=" + confirmado + ", pagacacheuta=" + pagacacheuta
				+ ", hotelID=" + hotelID + ", contacto=" + contacto + ", paxsreales=" + paxsreales + ", proveedorID="
				+ proveedorID + ", planilla=" + planilla + ", reservaID=" + reservaID + ", numerovoucher="
				+ numerovoucher + ", usuario=" + usuario + ", conffecharecepcion=" + conffecharecepcion
				+ ", conffechaemision=" + conffechaemision + ", confnumero=" + confnumero + ", confcantidadpaxs="
				+ confcantidadpaxs + ", confnombre=" + confnombre + ", confcontraslado=" + confcontraslado
				+ ", confpaxsnoshow=" + confpaxsnoshow + ", reservaorigenID=" + reservaorigenID + ", fechaabierta="
				+ fechaabierta + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + "]";
	}

	

}
