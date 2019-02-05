package com.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.dto.ReservaDTO;
import com.springboot.app.models.entity.Reserva;
import com.springboot.app.models.service.IReservaService;

/**
*
* @author Jose
*/
@RestController
@RequestMapping("api")
public class ReservaRestController {
	
	@Autowired IReservaService iReservaService;
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/reserva")
    public List<Reserva> listar() {
        return iReservaService.findAll();
    }
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@PostMapping("/reservas")
	public Boolean generarReserva(@RequestBody List<ReservaDTO> reserva) {
		System.out.println("en el restController");
		return iReservaService.generarReserva(reserva);		
	}
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@GetMapping("/reservas/confirmadas/{cliente}/{estado}")
	public List<Reserva> listarReservasConfirmadas(@PathVariable int cliente, @PathVariable short estado){
		return iReservaService.findConfirmadaXCliente(cliente, estado);
	}
	
	

}
