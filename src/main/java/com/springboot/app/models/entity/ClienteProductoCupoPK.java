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
public class ClienteProductoCupoPK implements Serializable{
    
    @Id()
    @NotNull
    @Column(name = "cliente_id")
    private Long clienteID;
    
    @NotNull
    @Column(name = "producto_id")
    private Long productoID;
    
    @NotNull
    private short dias;

    public ClienteProductoCupoPK(Long clienteID, Long productoID, short dias) {
        this.clienteID = clienteID;
        this.productoID = productoID;
        this.dias = dias;
    }    
    
    public Long getClienteID() {
        return clienteID;
    }

    public void setClienteID(Long clienteID) {
        this.clienteID = clienteID;
    }

    public Long getProductoID() {
        return productoID;
    }

    public void setProductoID(Long productoID) {
        this.productoID = productoID;
    }
    
    public short getDias() {
        return dias;
    }

    public void setDias(short dias) {
        this.dias = dias;
    }
}
