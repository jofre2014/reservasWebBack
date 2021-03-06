/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "producto")
public class Producto  implements Serializable {
    
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Prd_ID")
    @NotNull
    private int productoID;  

    @Column(name = "Prd_Nombre")
    @NotNull
    @Size(max = 100)
    private String nombre;
    
    @Column(name = "Prd_Observaciones")
    @NotNull
    @Size(max = 200)
    private String observaciones;
  
    @Column(name = "Prd_Deshabilitado")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short deshabilitado;
   
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short traslado;
    
    @NotNull
    @Digits(integer = 1, fraction = 0)
    @Column(name = "punto_encuentro")
    private short puntoencuentro;  
    

    @Column(name = "venta_mostrador")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short ventamostrador;
  
    @Column(name = "venta_internet")
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private short ventainternet;
    
    private Date created;

    @NotNull
    private Date updated;

    @NotNull
    @Size(max = 32)
    private String uuid;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<VoucherPax> voucherpax;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<ProductoArticulo> productoArticulo;
    
    @OneToMany(  fetch = FetchType.LAZY, mappedBy = "productoID", cascade = CascadeType.ALL, orphanRemoval = true )
    private Set<GrupoProducto> grupoproductos = new HashSet<>();

    public Producto() {
        super();
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public short getDeshabilitado() {
        return deshabilitado;
    }

    public void setDeshabilitado(short deshabilitado) {
        this.deshabilitado = deshabilitado;
    }

    public short getTraslado() {
        return traslado;
    }

    public void setTraslado(short traslado) {
        this.traslado = traslado;
    }

    public short getVentamostrador() {
        return ventamostrador;
    }

    public void setVentamostrador(short ventamostrador) {
        this.ventamostrador = ventamostrador;
    }

    public short getVentainternet() {
        return ventainternet;
    }

    public void setVentainternet(short ventainternet) {
        this.ventainternet = ventainternet;
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
    
    

    public short getPuntoencuentro() {
		return puntoencuentro;
	}

	public void setPuntoencuentro(short puntoencuentro) {
		this.puntoencuentro = puntoencuentro;
	}

	@Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.productoID);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.observaciones);
        hash = 29 * hash + this.deshabilitado;
        hash = 29 * hash + this.traslado;
        hash = 29 * hash + this.ventamostrador;
        hash = 29 * hash + this.ventainternet;
        hash = 29 * hash + Objects.hashCode(this.created);
        hash = 29 * hash + Objects.hashCode(this.updated);
        hash = 29 * hash + Objects.hashCode(this.uuid);
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
        final Producto other = (Producto) obj;
        if (this.deshabilitado != other.deshabilitado) {
            return false;
        }
        if (this.traslado != other.traslado) {
            return false;
        }
        if (this.ventamostrador != other.ventamostrador) {
            return false;
        }
        if (this.ventainternet != other.ventainternet) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.observaciones, other.observaciones)) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.productoID, other.productoID)) {
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
        return "Producto{" + "productoID=" + productoID + ", nombre=" + nombre + ", observaciones=" + observaciones + ", deshabilitado=" + deshabilitado + ", traslado=" + traslado + ", ventamostrador=" + ventamostrador + ", ventainternet=" + ventainternet + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }
    
    
    
}
