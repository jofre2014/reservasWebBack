/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service;

import com.springboot.app.models.entity.ClienteGrupoCupo;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Romina
 */
public interface IClienteGrupoCupoService {
    
	List<ClienteGrupoCupo> findAll();
	
	Map<String, Integer> findCupos(String fecha);

}
