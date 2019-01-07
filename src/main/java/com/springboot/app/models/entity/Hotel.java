/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Long hotelID;

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

    public Long getHotelID() {
        return hotelID;
    }

    public void setHotelID(Long hotelID) {
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.hotelID);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.extras;
        hash = 97 * hash + this.paradaTraslado;
        hash = 97 * hash + this.autoID;
        hash = 97 * hash + Objects.hashCode(this.created);
        hash = 97 * hash + Objects.hashCode(this.updated);
        hash = 97 * hash + Objects.hashCode(this.uuid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        if (this.extras != other.extras) {
            return false;
        }
        if (this.paradaTraslado != other.paradaTraslado) {
            return false;
        }
        if (this.autoID != other.autoID) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.hotelID, other.hotelID)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.updated, other.updated)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hotelID=" + hotelID + ", nombre=" + nombre + ", extras=" + extras + ", paradaTraslado=" + paradaTraslado + ", autoID=" + autoID + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }

}
