package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
*
* @author Jose
*/

@Entity
@Table(name="reserva")
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Res_ID")
	private int reservaID;

	@NotNull
	@Column(name="Res_Neg_ID")
	@Digits(integer = 2, fraction = 0)
	private short negocioID;
	
	@NotNull
	@Column(name="Res_Cli_ID")
	private int clienteID;
	
	@NotNull
	@Column(name="Res_Fecha")
	private Date fechatoma;
	
	@Column(name="Res_In")
	private Date fechainservicio;
	
	@Column(name="Res_Out")
	private Date fechaoutservicio;
	
	@Column(name="Res_Vto")
	private Date fechavencimiento;
	
	@Column(name="Res_Horavto")
	@Temporal(TemporalType.TIME)
	private Date horavencimiento;
	
	@NotNull
	@Column(name="Res_Avisomail")
	@Digits(integer = 1, fraction = 0)
	private short avisomail;
	
	@NotNull
	@Column(name="Res_Pendiente")
	@Digits(integer = 1, fraction = 0)
	private short pendiente;
	
	@NotNull
	@Column(name="Res_Confirmada")
	@Digits(integer = 1, fraction = 0)
	private short confirmada;
	
	@NotNull
	@Column(name="Res_Facturada")
	@Digits(integer = 1, fraction = 0)
	private short facturada;
	
	@NotNull
	@Column(name="Res_Anulada")
	@Digits(integer = 1, fraction = 0)
	private short anulada;
	
	@NotNull
	@Column(name="Res_Eliminada")
	@Digits(integer = 1, fraction = 0)
	private short eliminada;
	
	@NotNull
	@Column(name="verificada")
	@Digits(integer = 1, fraction = 0)
	private short verificada;
	
	@NotNull
	@Column(name="Res_Nombrepax")
	@Size(max = 250)
	private String nombrepax;
	
	@NotNull
	@Column(name="Res_Paxs")
	@Digits(integer = 2, fraction = 0)
	private short cantidadpaxs;
	
	@NotNull
	@Column(name="Res_Observaciones")
	@Size(max = 250)
	private String observaciones;
	
	@NotNull
	@Column(name="Res_Vou_ID")
	private int voucherID;
	
	@NotNull
	@Column(name="Res_Pagacomision")
	@Digits(integer = 1, fraction = 0)
	private short pagacomision;
	
	@NotNull
	@Column(name="Res_Obscomision")
	@Size(max = 250)
	private String observcomision;
	
	@NotNull
	@Column(name="Res_Comisionpagada")
	@Digits(integer = 1, fraction = 0)
	private short comisionpagada;
	
	@NotNull
	@Column(name="Res_Pagacacheuta")
	@Digits(integer = 1, fraction = 0)
	private short pagacacheuta;
	
	@NotNull
	@Column(name="Res_Facturadofuera")
	@Digits(integer = 1, fraction = 0)
	private short facturadofuera;
	
	@NotNull
	@Column(name="Res_Reservaarticulo")
	@Size(max = 255)
	private String reservaarticulos;
	
	@NotNull
	@Column(name="Res_Usuario")
	@Size(max = 20)
	private String usuario;
	
	@NotNull
	@Column(name="Res_Cliente")
	@Size(max = 50)
	private String contacto;
	
	@NotNull
	@Column(name="Res_Reo_ID")
	@Digits(integer = 2, fraction = 0)
	private short reservaorigenid;
	
	@NotNull
	@Column(name="facturarextranjero")
	@Digits(integer = 1, fraction = 0)
	private short facturarextranjero;
	
	@NotNull
	@Column(name="fecha_abierta")
	@Digits(integer = 1, fraction = 0)
	private short fechaabierta;
	
	private Date created;
	
	@NotNull
	private Date updated;
	
	@NotNull
    @Size(max = 32)
    private String uuid;

	public int getReservaID() {
		return reservaID;
	}

	public void setReservaID(int reservaID) {
		this.reservaID = reservaID;
	}

	public short getNegocioID() {
		return negocioID;
	}

	public void setNegocioID(short negocioID) {
		this.negocioID = negocioID;
	}

	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public Date getFechatoma() {
		return fechatoma;
	}

	public void setFechatoma(Date fechatoma) {
		this.fechatoma = fechatoma;
	}

	public Date getFechainservicio() {
		return fechainservicio;
	}

	public void setFechainservicio(Date fechainservicio) {
		this.fechainservicio = fechainservicio;
	}

	public Date getFechaoutservicio() {
		return fechaoutservicio;
	}

	public void setFechaoutservicio(Date fechaoutservicio) {
		this.fechaoutservicio = fechaoutservicio;
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

	public short getAvisomail() {
		return avisomail;
	}

	public void setAvisomail(short avisomail) {
		this.avisomail = avisomail;
	}

	public short getPendiente() {
		return pendiente;
	}

	public void setPendiente(short pendiente) {
		this.pendiente = pendiente;
	}

	public short getConfirmada() {
		return confirmada;
	}

	public void setConfirmada(short confirmada) {
		this.confirmada = confirmada;
	}

	public short getFacturada() {
		return facturada;
	}

	public void setFacturada(short facturada) {
		this.facturada = facturada;
	}

	public short getAnulada() {
		return anulada;
	}

	public void setAnulada(short anulada) {
		this.anulada = anulada;
	}

	public short getEliminada() {
		return eliminada;
	}

	public void setEliminada(short eliminada) {
		this.eliminada = eliminada;
	}

	public short getVerificada() {
		return verificada;
	}

	public void setVerificada(short verificada) {
		this.verificada = verificada;
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(int voucherID) {
		this.voucherID = voucherID;
	}

	public short getPagacomision() {
		return pagacomision;
	}

	public void setPagacomision(short pagacomision) {
		this.pagacomision = pagacomision;
	}

	public String getObservcomision() {
		return observcomision;
	}

	public void setObservcomision(String observcomision) {
		this.observcomision = observcomision;
	}

	public short getComisionpagada() {
		return comisionpagada;
	}

	public void setComisionpagada(short comisionpagada) {
		this.comisionpagada = comisionpagada;
	}

	public short getPagacacheuta() {
		return pagacacheuta;
	}

	public void setPagacacheuta(short pagacacheuta) {
		this.pagacacheuta = pagacacheuta;
	}

	public short getFacturadofuera() {
		return facturadofuera;
	}

	public void setFacturadofuera(short facturadofuera) {
		this.facturadofuera = facturadofuera;
	}

	public String getReservaarticulos() {
		return reservaarticulos;
	}

	public void setReservaarticulos(String reservaarticulos) {
		this.reservaarticulos = reservaarticulos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public short getReservaorigenid() {
		return reservaorigenid;
	}

	public void setReservaorigenid(short reservaorigenid) {
		this.reservaorigenid = reservaorigenid;
	}

	public short getFacturarextranjero() {
		return facturarextranjero;
	}

	public void setFacturarextranjero(short facturarextranjero) {
		this.facturarextranjero = facturarextranjero;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anulada;
		result = prime * result + avisomail;
		result = prime * result + cantidadpaxs;
		result = prime * result + clienteID;
		result = prime * result + comisionpagada;
		result = prime * result + confirmada;
		result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + eliminada;
		result = prime * result + facturada;
		result = prime * result + facturadofuera;
		result = prime * result + facturarextranjero;
		result = prime * result + fechaabierta;
		result = prime * result + ((fechainservicio == null) ? 0 : fechainservicio.hashCode());
		result = prime * result + ((fechaoutservicio == null) ? 0 : fechaoutservicio.hashCode());
		result = prime * result + ((fechatoma == null) ? 0 : fechatoma.hashCode());
		result = prime * result + ((fechavencimiento == null) ? 0 : fechavencimiento.hashCode());
		result = prime * result + ((horavencimiento == null) ? 0 : horavencimiento.hashCode());
		result = prime * result + negocioID;
		result = prime * result + ((nombrepax == null) ? 0 : nombrepax.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((observcomision == null) ? 0 : observcomision.hashCode());
		result = prime * result + pagacacheuta;
		result = prime * result + pagacomision;
		result = prime * result + pendiente;
		result = prime * result + reservaID;
		result = prime * result + ((reservaarticulos == null) ? 0 : reservaarticulos.hashCode());
		result = prime * result + reservaorigenid;
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		result = prime * result + verificada;
		result = prime * result + voucherID;
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
		Reserva other = (Reserva) obj;
		if (anulada != other.anulada)
			return false;
		if (avisomail != other.avisomail)
			return false;
		if (cantidadpaxs != other.cantidadpaxs)
			return false;
		if (clienteID != other.clienteID)
			return false;
		if (comisionpagada != other.comisionpagada)
			return false;
		if (confirmada != other.confirmada)
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
		if (eliminada != other.eliminada)
			return false;
		if (facturada != other.facturada)
			return false;
		if (facturadofuera != other.facturadofuera)
			return false;
		if (facturarextranjero != other.facturarextranjero)
			return false;
		if (fechaabierta != other.fechaabierta)
			return false;
		if (fechainservicio == null) {
			if (other.fechainservicio != null)
				return false;
		} else if (!fechainservicio.equals(other.fechainservicio))
			return false;
		if (fechaoutservicio == null) {
			if (other.fechaoutservicio != null)
				return false;
		} else if (!fechaoutservicio.equals(other.fechaoutservicio))
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
		if (negocioID != other.negocioID)
			return false;
		if (nombrepax == null) {
			if (other.nombrepax != null)
				return false;
		} else if (!nombrepax.equals(other.nombrepax))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (observcomision == null) {
			if (other.observcomision != null)
				return false;
		} else if (!observcomision.equals(other.observcomision))
			return false;
		if (pagacacheuta != other.pagacacheuta)
			return false;
		if (pagacomision != other.pagacomision)
			return false;
		if (pendiente != other.pendiente)
			return false;
		if (reservaID != other.reservaID)
			return false;
		if (reservaarticulos == null) {
			if (other.reservaarticulos != null)
				return false;
		} else if (!reservaarticulos.equals(other.reservaarticulos))
			return false;
		if (reservaorigenid != other.reservaorigenid)
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
		if (verificada != other.verificada)
			return false;
		if (voucherID != other.voucherID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reserva [reservaID=" + reservaID + ", negocioID=" + negocioID + ", clienteID=" + clienteID
				+ ", fechatoma=" + fechatoma + ", fechainservicio=" + fechainservicio + ", fechaoutservicio="
				+ fechaoutservicio + ", fechavencimiento=" + fechavencimiento + ", horavencimiento=" + horavencimiento
				+ ", avisomail=" + avisomail + ", pendiente=" + pendiente + ", confirmada=" + confirmada
				+ ", facturada=" + facturada + ", anulada=" + anulada + ", eliminada=" + eliminada + ", verificada="
				+ verificada + ", nombrepax=" + nombrepax + ", cantidadpaxs=" + cantidadpaxs + ", observaciones="
				+ observaciones + ", voucherID=" + voucherID + ", pagacomision=" + pagacomision + ", observcomision="
				+ observcomision + ", comisionpagada=" + comisionpagada + ", pagacacheuta=" + pagacacheuta
				+ ", facturadofuera=" + facturadofuera + ", reservaarticulos=" + reservaarticulos + ", usuario="
				+ usuario + ", contacto=" + contacto + ", reservaorigenid=" + reservaorigenid + ", facturarextranjero="
				+ facturarextranjero + ", fechaabierta=" + fechaabierta + ", created=" + created + ", updated="
				+ updated + ", uuid=" + uuid + "]";
	}
	
	
	
	
	
	
}
