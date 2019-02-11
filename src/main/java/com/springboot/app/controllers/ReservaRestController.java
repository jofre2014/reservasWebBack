package com.springboot.app.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	@GetMapping("/reservas/confirmadas/{cliente}/{estado}/{page}")
	public Page<Reserva> listarReservasEstadoConfir(@PathVariable int cliente, @PathVariable short estado, @PathVariable Integer page){
		return iReservaService.findConfirmadaXCliente(cliente, estado, PageRequest.of(page, 2));
	}
	
	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@PutMapping("/reservas/confirmarReserva/{reservaID}")
	public Boolean confirmarReserva(@PathVariable int reservaID) {
		System.out.println("Id de reservaaa!!!" + reservaID );
		Reserva updateReserva = iReservaService.findById(reservaID);
		
		System.out.println("reserva: " + updateReserva);
		
		ObjectMapper mapperObj = new ObjectMapper();
		try {
			String jsonStr = mapperObj.writeValueAsString(updateReserva);

			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		updateReserva.setConfirmada((short) 1);
		updateReserva.setPendiente((short) 0);
		updateReserva.setUpdated(new Date());
		
		
	
		try {
		Reserva reservaActualizaa =  iReservaService.save(updateReserva);
		System.out.println("reservaActualizada: " + reservaActualizaa);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
	

}
