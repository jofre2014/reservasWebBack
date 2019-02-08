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
@Table(name = "clientegrupocupo")
public class ClienteGrupoCupo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Valid
    @EmbeddedId
    private ClienteGrupoCupoPK clienteGrupoCupoPK;
    
    @NotNull
    private short cantidad;
    
    @Column(name = "clientegrupocupo_id")
    @NotNull
    private Long clientegrupocupo_id;

    private Date created;
    
    @NotNull
    private Date updated;
    
    @NotNull
    @Size(max = 32)
    private String uuid;

    
       
    public ClienteGrupoCupo() {
        super();
    }

     

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
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

    public ClienteGrupoCupoPK getClienteGrupoCupoPK() {
        return clienteGrupoCupoPK;
    }

    public void setClienteGrupoCupoPK(ClienteGrupoCupoPK clienteGrupoCupoPK) {
        this.clienteGrupoCupoPK = clienteGrupoCupoPK;
    }

    public Long getClientegrupocupo_id() {
        return clientegrupocupo_id;
    }

    public void setClientegrupocupo_id(Long clientegrupocupo_id) {
        this.clientegrupocupo_id = clientegrupocupo_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.clienteGrupoCupoPK);
        hash = 97 * hash + this.cantidad;
        hash = 97 * hash + Objects.hashCode(this.clientegrupocupo_id);
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
        final ClienteGrupoCupo other = (ClienteGrupoCupo) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        if (!Objects.equals(this.clienteGrupoCupoPK, other.clienteGrupoCupoPK)) {
            return false;
        }
        if (!Objects.equals(this.clientegrupocupo_id, other.clientegrupocupo_id)) {
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
        return "ClienteGrupoCupo{" + "clienteGrupoCupoPK=" + clienteGrupoCupoPK + ", cantidad=" + cantidad + ", clientegrupocupo_id=" + clientegrupocupo_id + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }

   

    

    
}
