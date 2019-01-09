/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Romina
 */
@Embeddable
public class ClienteGrupoCupoPK implements Serializable{
    
    //@Id
    @NotNull
    @Column(name = "cliente_id")
    private Long clienteID;
    
    @NotNull
    @Column(name = "grupo_id")
    private Long grupoID;
    
    @NotNull
    private short dias;

    public ClienteGrupoCupoPK(Long clienteID, Long productoID, short dias) {
        this.clienteID = clienteID;
        this.grupoID = productoID;
        this.dias = dias;
    }    
    
    public Long getClienteID() {
        return clienteID;
    }

    public void setClienteID(Long clienteID) {
        this.clienteID = clienteID;
    }

    public Long getGrupoID() {
        return grupoID;
    }

    public void setGrupoID(Long grupoID) {
        this.grupoID = grupoID;
    }  
    
    public short getDias() {
        return dias;
    }

    public void setDias(short dias) {
        this.dias = dias;
    }
}
