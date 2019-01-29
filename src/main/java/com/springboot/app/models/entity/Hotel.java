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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Romina
 */
@Entity
@Table(name = "hotel")
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "hot_id")
    @Digits(integer = 4, fraction = 0)
    private int hotelID;
    
//    @OneToOne(mappedBy = "hotel", cascade = CascadeType.ALL)
//    private VoucherPax voucherpax;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel")
    private List<VoucherPax> voucherpax;

    @NotNull
    @Column(name = "hot_nombre")
    @Size(max = 100)
    private String nombre;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short extras;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    @Column(name = "parada_traslado")
    private short paradaTraslado;
    
    @NotNull
    @Digits(integer = 1, fraction = 0)
    @Column(name="punto_encuentro")
    private short puntoEncuentro;

    @NotNull
    @Digits(integer = 4, fraction = 0)
    @Column(name = "auto_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int autoID;

    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;

    public Hotel() {
        super();
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getExtras() {
        return extras;
    }

    public void setExtras(short extras) {
        this.extras = extras;
    }

    public short getParadaTraslado() {
        return paradaTraslado;
    }

    public void setParadaTraslado(short paradaTraslado) {
        this.paradaTraslado = paradaTraslado;
    }
    
    

    public short getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(short puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public int getAutoID() {
        return autoID;
    }

    public void setAutoID(int autoID) {
        this.autoID = autoID;
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
		result = prime * result + autoID;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + extras;
		result = prime * result + hotelID;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + paradaTraslado;
		result = prime * result + puntoEncuentro;
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		Hotel other = (Hotel) obj;
		if (autoID != other.autoID)
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (extras != other.extras)
			return false;
		if (hotelID != other.hotelID)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (paradaTraslado != other.paradaTraslado)
			return false;
		if (puntoEncuentro != other.puntoEncuentro)
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
		return true;
	}

	@Override
	public String toString() {
		return "Hotel [hotelID=" + hotelID + ", nombre=" + nombre + ", extras=" + extras + ", paradaTraslado="
				+ paradaTraslado + ", puntoEncuentro=" + puntoEncuentro + ", autoID=" + autoID + ", created=" + created
				+ ", updated=" + updated + ", uuid=" + uuid + "]";
	}

   
}
