package com.springboot.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public ResponseEntity< Object > listar() {
		
		Authentication authentication = authenticationFacade.getAuthentication();
		System.out.println( authentication );
		List<Persona> personas =personaService.findAll();
		
		return new ResponseEntity<>( personas, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/personas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity< Object > listarPersonas( @Valid  @RequestBody Persona persona, BindingResult bindingResult ) {
		
		if (bindingResult.hasErrors()) {
			
			//bindingResult.
		}		
				
		return new ResponseEntity<>( persona, HttpStatus.CREATED);
	}
}
