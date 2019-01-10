package com.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.components.IAuthenticationFacade;
import com.springboot.app.models.entity.Persona;
import com.springboot.app.models.service.IPersonaService;


@RestController
@RequestMapping("api")
public class PersonaRestController {
	
	@Autowired
	private IAuthenticationFacade authenticationFacade;

	@Autowired
	private IPersonaService personaService;
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_USER')")
	@GetMapping(value = "/personas")
	public List<Persona> listar() {
		
		Authentication authentication = authenticationFacade.getAuthentication();
		System.out.println( authentication );
		
		return personaService.findAll();
	}
}
