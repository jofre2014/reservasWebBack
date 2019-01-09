/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entity.ClienteGrupoCupo;

/**
 *
 * @author Romina
 */
public interface IClienteProductoCupoDao extends JpaRepository <ClienteGrupoCupo, Long>{
    
}


