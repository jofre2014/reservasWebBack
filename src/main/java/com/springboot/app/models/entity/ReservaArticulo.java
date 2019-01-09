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
@Table(name="reservaarticulo")
public class ReservaArticulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Digits(integer = 4, fraction = 0)
    @Column(name = "RAr_ID")
    private int reservaarticuloID;

    @NotNull
    @Digits(integer = 2, fraction = 0)
    @Column(name = "RAr_Neg_ID")
    private short negocioID;

    @Column(name = "RAr_Res_ID")
    @Digits(integer = 4, fraction = 0)
    private int reservaID;

    @Column(name = "RAr_Vou_ID")
    @Digits(integer = 4, fraction = 0)
    private int voucherID;

    @NotNull
    @Column(name = "RAr_Art_ID")
    @Size(max = 20)
    private String articuloID;

    @NotNull
    @Digits(integer = 2, fraction = 0)
    @Column(name = "RAr_Cantidad")
    private int cantidad;

    @NotNull
    @Digits(integer = 7, fraction = 4)
    @Column(name = "RAr_Comision")
    private double comision;

    @NotNull
    @Digits(integer = 10, fraction = 2)
    @Column(name = "RAr_PrecioUnitSinComision")
    private double preciounitariosincomision;

    @NotNull
    @Digits(integer = 10, fraction = 2)
    @Column(name = "RAr_PrecioUnitario")
    private double preciounitario;

    @NotNull
    @Digits(integer = 10, fraction = 2)
    @Column(name = "RAr_PrecioCompra")
    private double preciocompra;

    @NotNull
    @Size(max = 250)
    @Column(name = "RAr_Observaciones")
    private String observaciones;

    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;

    public ReservaArticulo() {
        super();
    }

    public int getReservaarticuloID() {
        return reservaarticuloID;
    }

    public void setReservaarticuloID(int reservaarticuloID) {
        this.reservaarticuloID = reservaarticuloID;
    }

    public short getNegocioID() {
        return negocioID;
    }

    public void setNegocioID(short negocioID) {
        this.negocioID = negocioID;
    }

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }

    public int getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(int voucherID) {
        this.voucherID = voucherID;
    }

    public String getArticuloID() {
        return articuloID;
    }

    public void setArticuloID(String articuloID) {
        this.articuloID = articuloID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getPreciounitariosincomision() {
        return preciounitariosincomision;
    }

    public void setPreciounitariosincomision(double preciounitariosincomision) {
        this.preciounitariosincomision = preciounitariosincomision;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        int hash = 3;
        hash = 19 * hash + this.reservaarticuloID;
        hash = 19 * hash + this.negocioID;
        hash = 19 * hash + this.reservaID;
        hash = 19 * hash + this.voucherID;
        hash = 19 * hash + Objects.hashCode(this.articuloID);
        hash = 19 * hash + this.cantidad;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.comision) ^ (Double.doubleToLongBits(this.comision) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.preciounitariosincomision) ^ (Double.doubleToLongBits(this.preciounitariosincomision) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.preciounitario) ^ (Double.doubleToLongBits(this.preciounitario) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.preciocompra) ^ (Double.doubleToLongBits(this.preciocompra) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.observaciones);
        hash = 19 * hash + Objects.hashCode(this.created);
        hash = 19 * hash + Objects.hashCode(this.updated);
        hash = 19 * hash + Objects.hashCode(this.uuid);
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
        final ReservaArticulo other = (ReservaArticulo) obj;
        if (this.reservaarticuloID != other.reservaarticuloID) {
            return false;
        }
        if (this.negocioID != other.negocioID) {
            return false;
        }
        if (this.reservaID != other.reservaID) {
            return false;
        }
        if (this.voucherID != other.voucherID) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.comision) != Double.doubleToLongBits(other.comision)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preciounitariosincomision) != Double.doubleToLongBits(other.preciounitariosincomision)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preciounitario) != Double.doubleToLongBits(other.preciounitario)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preciocompra) != Double.doubleToLongBits(other.preciocompra)) {
            return false;
        }
        if (!Objects.equals(this.articuloID, other.articuloID)) {
            return false;
        }
        if (!Objects.equals(this.observaciones, other.observaciones)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
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
        return "ReservaArticulo{" + "reservaarticuloID=" + reservaarticuloID + ", negocioID=" + negocioID + ", reservaID=" + reservaID + ", voucherID=" + voucherID + ", articuloID=" + articuloID + ", cantidad=" + cantidad + ", comision=" + comision + ", preciounitariosincomision=" + preciounitariosincomision + ", preciounitario=" + preciounitario + ", preciocompra=" + preciocompra + ", observaciones=" + observaciones + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }

}
