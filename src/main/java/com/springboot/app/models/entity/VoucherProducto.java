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
@Table(name = "voucherproducto")
public class VoucherProducto implements Serializable{
    
       private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VPr_ID")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int voucherproductoID;

    @Column(name = "VPr_Vou_ID")
    @NotNull
    @Digits(integer = 4, fraction = 0)
    private int voucherID;
    
    @Column(name = "VPr_Prd_ID")
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private short productoID;
   
    @Column(name = "VPr_Paxs")
    @NotNull
    @Digits(integer = 2, fraction = 0)
    private short cantidadpaxs;
      
    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;

    public VoucherProducto() {
        super();
    }

    public int getVoucherproductoID() {
        return voucherproductoID;
    }

    public void setVoucherproductoID(int voucherproductoID) {
        this.voucherproductoID = voucherproductoID;
    }

    public int getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(int voucherID) {
        this.voucherID = voucherID;
    }

    public short getProductoID() {
        return productoID;
    }

    public void setProductoID(short productoID) {
        this.productoID = productoID;
    }

    public short getCantidadpaxs() {
        return cantidadpaxs;
    }

    public void setCantidadpaxs(short cantidadpaxs) {
        this.cantidadpaxs = cantidadpaxs;
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
        hash = 23 * hash + this.voucherproductoID;
        hash = 23 * hash + this.voucherID;
        hash = 23 * hash + this.productoID;
        hash = 23 * hash + this.cantidadpaxs;
        hash = 23 * hash + Objects.hashCode(this.created);
        hash = 23 * hash + Objects.hashCode(this.updated);
        hash = 23 * hash + Objects.hashCode(this.uuid);
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
        final VoucherProducto other = (VoucherProducto) obj;
        if (this.voucherproductoID != other.voucherproductoID) {
            return false;
        }
        if (this.voucherID != other.voucherID) {
            return false;
        }
        if (this.productoID != other.productoID) {
            return false;
        }
        if (this.cantidadpaxs != other.cantidadpaxs) {
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
        return "VoucherProducto{" + "voucherproductoID=" + voucherproductoID + ", voucherID=" + voucherID + ", productoID=" + productoID + ", cantidadpaxs=" + cantidadpaxs + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }
    
    
    
}