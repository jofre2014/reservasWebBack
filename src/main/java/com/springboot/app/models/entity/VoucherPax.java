package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="voucherpax")
public class VoucherPax implements Serializable {
	
//	@Valid
//    @EmbeddedId
//    private VoucherPaxPK vaucherPaxPK;
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "voucherpax_id")
	@NotNull
	@Digits(integer = 4, fraction = 0)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int voucherpaxID;
	
//	@ManyToOne
//    @JoinColumn(name = "voucher_id", nullable = false, updatable = false)
//    private Voucher voucher;
	@NotNull
	@Column(name="voucher_id")
	private Integer voucherID;
	
	@ManyToOne
	@JoinColumn(name = "producto_id", nullable = false, updatable = false)
	private Producto producto;
	
	@OneToOne
    @JoinColumn(name = "hotel_id", updatable = false, nullable = false)
    private Hotel hotel;
	
	@NotNull
	@Column(name="apellido")
	@Size(max = 100)
	private String apellido;
	
	@NotNull
	@Column(name="nombre")
	@Size(max = 100)
	private String nombre;
	
	@NotNull
	@Column(name="documento")
	@Digits(integer = 11, fraction = 0)
	private Long documento;
	
	@NotNull
	@Column(name="edad")
	@Digits(integer = 2, fraction = 0)
	private short edad;
	
	@NotNull
	@Column(name="alojado")
	@Digits(integer = 1, fraction = 0)
	private short alojado;
	
	
	@Column(name="fecha_servicio")
	private Date fechaServicio;
	

	@Column(name="telefono")
	@Size(max=30)
	private String telefono;
		
	@NotNull
	@Column(name="whatsapp")
	@Digits(integer = 1, fraction = 0)
	private short whatsapp;
	
	private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;


	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public short getAlojado() {
		return alojado;
	}

	public void setAlojado(short alojado) {
		this.alojado = alojado;
	}

	public Date getFechaServicio() {
		return fechaServicio;
	}

	public void setFechaServicio(Date fechaServicio) {
		this.fechaServicio = fechaServicio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public short getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(short whatsapp) {
		this.whatsapp = whatsapp;
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
	
	

	public int getVoucherpaxID() {
		return voucherpaxID;
	}

	public void setVoucherpaxID(int voucherpaxID) {
		this.voucherpaxID = voucherpaxID;
	}

//	public Voucher getVoucher() {
//		return voucher;
//	}
//
//	public void setVoucher(Voucher voucher) {
//		this.voucher = voucher;
//	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	

	public Integer getVoucherID() {
		return voucherID;
	}

	public void setVoucherID(Integer voucherID) {
		this.voucherID = voucherID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alojado;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + edad;
		result = prime * result + ((fechaServicio == null) ? 0 : fechaServicio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		result = prime * result + voucherpaxID;
		result = prime * result + whatsapp;
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
		VoucherPax other = (VoucherPax) obj;
		if (alojado != other.alojado)
			return false;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (edad != other.edad)
			return false;
		if (fechaServicio == null) {
			if (other.fechaServicio != null)
				return false;
		} else if (!fechaServicio.equals(other.fechaServicio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		if (voucherpaxID != other.voucherpaxID)
			return false;
		if (whatsapp != other.whatsapp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VoucherPax [voucherpaxID=" + voucherpaxID + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", documento=" + documento + ", edad=" + edad + ", alojado=" + alojado + ", fechaServicio="
				+ fechaServicio + ", telefono=" + telefono + ", whatsapp=" + whatsapp + ", created=" + created
				+ ", updated=" + updated + ", uuid=" + uuid + "]";
	}
	
	
	
	
	

}
