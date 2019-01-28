/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.controllers;

import com.springboot.app.models.entity.Hotel;
import com.springboot.app.models.service.IHotelService;
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
public class HotelRestController {
    
    @Autowired
    private IHotelService iHotelService;
 
    @PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/hoteles")
	public List<Hotel> listar() {
		return iHotelService.findAll();
	}
    
    @PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@GetMapping(value = "/hoteles/{traslado}/{ptoEncuentro}")
    public List<Hotel> getHotelTrasladoPtoEnceuntro(@PathVariable short traslado, @PathVariable short ptoEncuentro){
		return iHotelService.getHotelTrasladoPtoEncuentro(traslado, ptoEncuentro);
    	
    }
    
}
