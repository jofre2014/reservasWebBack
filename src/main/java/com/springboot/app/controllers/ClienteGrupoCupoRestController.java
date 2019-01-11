/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.controllers;

import com.springboot.app.models.entity.ClienteGrupoCupo;
import com.springboot.app.models.service.IClienteGrupoCupoService;
import com.springboot.app.pojos.CuposDisponible;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Romina
 */
@RestController
@RequestMapping("api")
public class ClienteGrupoCupoRestController {
    
    @Autowired
	private IClienteGrupoCupoService clienteGrupoCupoService;
	
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/cpc")
	public List<ClienteGrupoCupo> listar() {
		return clienteGrupoCupoService.findAll();
	}
	
	/**
	 *
	 * @author Jose
	 */
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/cupos/{fecha}")
	public List<CuposDisponible> recuperaCupos(@PathVariable String fecha) {
		return clienteGrupoCupoService.findCupos(fecha);
	}

}
