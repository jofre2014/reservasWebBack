/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.controllers;

import com.springboot.app.models.entity.ClienteProductoCupo;
import com.springboot.app.models.service.IClienteProductoCupoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Romina
 */
@RestController
@RequestMapping("api")
public class ClienteProductoCupoRestController {
    
    @Autowired
	private IClienteProductoCupoService clienteProductoCupoService;
	
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/cpc")
	public List<ClienteProductoCupo> listar() {
		return clienteProductoCupoService.findAll();
	}
}
