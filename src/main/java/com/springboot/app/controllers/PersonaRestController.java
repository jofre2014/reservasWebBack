package com.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.models.entity.Persona;
import com.springboot.app.models.service.IPersonaService;



@RestController
@RequestMapping("api")
public class PersonaRestController {

	@Autowired
	private IPersonaService personaService;
	
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/personas")
	public List<Persona> listar() {
		return personaService.findAll();
	}
}
