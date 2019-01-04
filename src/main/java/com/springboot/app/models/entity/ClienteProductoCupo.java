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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Romina
 */
@Entity
@Table(name = "clienteproductocupo")
public class ClienteProductoCupo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Valid
    @EmbeddedId
    private ClienteProductoCupoPK clienteProductoPK;
    
    @NotNull
    private short cantidad;
    
    @Column(name = "clienteproductocupo_id")
    @NotNull
    private Long clienteproductocupoID;

    private Date created;
    
    @NotNull
    private Date updated;
    
    @NotNull
    @Size(max = 32)
    private String uuid;

    
       
    public ClienteProductoCupo() {
        super();
    }

    public ClienteProductoCupoPK getClienteProductoPK() {
        return clienteProductoPK;
    }

    public void setClienteProductoPK(ClienteProductoCupoPK clienteProductoPK) {
        this.clienteProductoPK = clienteProductoPK;
    }

    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public Long getClienteproductocupoID() {
        return clienteproductocupoID;
    }

    public void setClienteproductocupoID(Long clienteproductocupoID) {
        this.clienteproductocupoID = clienteproductocupoID;
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
        hash = 59 * hash + Objects.hashCode(this.clienteProductoPK);
        hash = 59 * hash + this.cantidad;
        hash = 59 * hash + Objects.hashCode(this.clienteproductocupoID);
        hash = 59 * hash + Objects.hashCode(this.created);
        hash = 59 * hash + Objects.hashCode(this.updated);
        hash = 59 * hash + Objects.hashCode(this.uuid);
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
        final ClienteProductoCupo other = (ClienteProductoCupo) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.clienteProductoPK, other.clienteProductoPK)) {
            return false;
        }
        if (!Objects.equals(this.clienteproductocupoID, other.clienteproductocupoID)) {
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
        return "ClienteProductoCupo{" + "clienteProductoPK=" + clienteProductoPK + ", cantidad=" + cantidad + ", clienteproductocupoID=" + clienteproductocupoID + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }

    

    
}
