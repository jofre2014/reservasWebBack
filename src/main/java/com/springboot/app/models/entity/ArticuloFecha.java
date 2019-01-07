/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

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
@Table(name = "articulofecha")
public class ArticuloFecha {
    
    @Id
    @NotNull
    @Column(name = "articulo_id")
    private String articuloID;
    
    @NotNull
    private Date fecha;
    
    @NotNull
    @Column(name = "precio_usd")
    @Digits(integer = 16 , fraction = 2 ) 
    private float precioUSD;
    
    @NotNull
    @Column(name = "precio_ars")
    @Digits(integer = 16 , fraction = 2 ) 
    private float precioARS;
    
    @NotNull
    @Digits(integer = 4, fraction = 0)
    @Column(name = "articulofecha_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int articulofechaID;
    
    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;

    public ArticuloFecha() {
        super();
    }

    public String getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(String articuloID) {
        this.articuloID = articuloID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPrecioUSD() {
        return precioUSD;
    }

    public void setPrecioUSD(float precioUSD) {
        this.precioUSD = precioUSD;
    }

    public float getPrecioARS() {
        return precioARS;
    }

    public void setPrecioARS(float precioARS) {
        this.precioARS = precioARS;
    }

    public int getArticulofechaID() {
        return articulofechaID;
    }

    public void setArticulofechaID(int articulofechaID) {
        this.articulofechaID = articulofechaID;
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
        hash = 41 * hash + Objects.hashCode(this.articuloID);
        hash = 41 * hash + Objects.hashCode(this.fecha);
        hash = 41 * hash + Float.floatToIntBits(this.precioUSD);
        hash = 41 * hash + Float.floatToIntBits(this.precioARS);
        hash = 41 * hash + this.articulofechaID;
        hash = 41 * hash + Objects.hashCode(this.created);
        hash = 41 * hash + Objects.hashCode(this.updated);
        hash = 41 * hash + Objects.hashCode(this.uuid);
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
        final ArticuloFecha other = (ArticuloFecha) obj;
        if (Float.floatToIntBits(this.precioUSD) != Float.floatToIntBits(other.precioUSD)) {
            return false;
        }
        if (Float.floatToIntBits(this.precioARS) != Float.floatToIntBits(other.precioARS)) {
            return false;
        }
        if (this.articulofechaID != other.articulofechaID) {
            return false;
        }
        if (!Objects.equals(this.articuloID, other.articuloID)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
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
        return "ArticuloFecha{" + "articuloID=" + articuloID + ", fecha=" + fecha + ", precioUSD=" + precioUSD + ", precioARS=" + precioARS + ", articulofechaID=" + articulofechaID + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }
    
    
    
}

