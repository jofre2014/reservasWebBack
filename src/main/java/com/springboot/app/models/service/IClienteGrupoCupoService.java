/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service;

import com.springboot.app.models.entity.ClienteGrupoCupo;
import com.springboot.app.pojos.CuposDisponible;

import java.util.List;


/**
 *
 * @author Romina
 */
public interface IClienteGrupoCupoService {
    
	List<ClienteGrupoCupo> findAll();
	
	List<CuposDisponible> findCupos(String fecha);

}
