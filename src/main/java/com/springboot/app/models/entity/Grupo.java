/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name = "grupo")
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "Gru_ID")
    @Digits(integer = 2, fraction = 0)
    private int grupoID;

    @NotNull
    @Column(name = "Gru_Nombre")
    @Size(max = 150)
    private String nombre;

    @NotNull
    @Column(name = "venta_internet")
    @Digits(integer = 1, fraction = 0)
    private short ventainternet;

    @Column(name = "created")
    private Timestamp created;

    @NotNull
    @Column(name = "updated")
    private Timestamp updated;

    @NotNull
    @Column(name = "uuid")
    @Size(max = 32)
    private String uuid;

    public Grupo() {
        super();
    }

    public int getGrupoID() {
        return grupoID;
    }

    public void setGrupoID(int grupoID) {
        this.grupoID = grupoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getVentainternet() {
        return ventainternet;
    }

    public void setVentainternet(short ventainternet) {
        this.ventainternet = ventainternet;
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
        int hash = 3;
        hash = 31 * hash + this.grupoID;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + this.ventainternet;
        hash = 31 * hash + Objects.hashCode(this.created);
        hash = 31 * hash + Objects.hashCode(this.updated);
        hash = 31 * hash + Objects.hashCode(this.uuid);
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
        final Grupo other = (Grupo) obj;
        if (this.grupoID != other.grupoID) {
            return false;
        }
        if (this.ventainternet != other.ventainternet) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
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
        return "Grupo{" + "grupoID=" + grupoID + ", nombre=" + nombre + ", ventainternet=" + ventainternet + ", created=" + created + ", updated=" + updated + ", uuid=" + uuid + '}';
    }

}
