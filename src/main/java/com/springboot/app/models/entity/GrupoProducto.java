/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "grupoproducto")
public class GrupoProducto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "GrP_ID")
    @Digits(integer = 4, fraction = 0)
    private int grupoproductoID;

    @NotNull
    @Column(name = "GrP_Gru_ID")
    @Digits(integer = 2, fraction = 0)
    private int grupoID;

    @NotNull
    @Column(name = "GrP_Prd_ID")
    @Digits(integer = 2, fraction = 0)
    private int productoID;


    @NotNull
    @Column(name = "GrP_Coeficiente")
    @Digits(integer = 6, fraction = 2)
    private float coeficiente;

    @Column(name = "created")
    private Timestamp created;

    @NotNull
    @Column(name = "updated")
    private Timestamp updated;

    @NotNull
    @Column(name = "uuid")
    @Size(max = 32)
    private String uuid;
    
//    @ManyToOne   
//    @JoinColumn(
//            name = "GrP_Prd_ID",
//            referencedColumnName = "Prd_ID" )    
//    private Producto productoID;
//       
   
//    @ManyToOne
//    @JoinColumn( name = "GrP_Gru_ID",
//		referencedColumnName = "Gru_ID" )
//    private Grupo grupoID;  

    public GrupoProducto() {
        super();
    }

//    public int getGrupoproductoID() {
//        return grupoproductoID;
//    }
//
//    public void setGrupoproductoID(int grupoproductoID) {
//        this.grupoproductoID = grupoproductoID;
//    }

    public int getGrupoID() {
        return grupoID;
    }

    public void setGrupoID(int grupoID) {
        this.grupoID = grupoID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public float getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(float coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
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
        int hash = 5;
        hash = 79 * hash + this.grupoproductoID;
//        hash = 79 * hash + this.grupoID;
//        hash = 79 * hash + this.productoID;
        hash = 79 * hash + Float.floatToIntBits(this.coeficiente);
        hash = 79 * hash + Objects.hashCode(this.created);
        hash = 79 * hash + Objects.hashCode(this.updated);
        hash = 79 * hash + Objects.hashCode(this.uuid);
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
        final GrupoProducto other = (GrupoProducto) obj;
        if (this.grupoproductoID != other.grupoproductoID) {
            return false;
        }
//        if (this.grupoID != other.grupoID) {
//            return false;
//        }
//        if (this.productoID != other.productoID) {
//            return false;
//        }
        if (Float.floatToIntBits(this.coeficiente) != Float.floatToIntBits(other.coeficiente)) {
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

//    @Override
//    public String toString() {
//        return "GrupoProducto{" + "grupoproductoID=" + grupoproductoID + ", grupoID=" + grupoID + ", productoID=" + productoID + ", coeficiente=" + coeficiente + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
//    }

}
