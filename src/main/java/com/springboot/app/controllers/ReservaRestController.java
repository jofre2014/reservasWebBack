package com.springboot.app.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
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

	@Autowired
	IReservaService iReservaService;

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
	public Page<Reserva> listarReservasEstadoConfir(@PathVariable int cliente, @PathVariable short estado,
			@PathVariable Integer page) {
		return iReservaService.findConfirmadaXCliente(cliente, estado, PageRequest.of(page, 2));
	}

	@PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
	@PutMapping("/reservas/confirmarReserva/{reservaID}")
	public ResponseEntity<?> confirmarReserva(@PathVariable int reservaID) {
		Map<String, Object> response = new HashMap<>();
		
		Reserva updateReserva = iReservaService.findById(reservaID);
		
				
		if (updateReserva == null) {
			response.put("mensaje", "Error: no se pudo confirmar la reserva, reserva ID: "
					.concat(((Integer)reservaID).toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		try {
			
		updateReserva.setConfirmada((short) 1);
		updateReserva.setPendiente((short) 0);
		updateReserva.setUpdated(new Date());
			
		Reserva reservaActualizaa = iReservaService.save(updateReserva);

		} catch (DataAccessException e) {
			response.put("mensaje", "Error al confirmar reserva en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "La reserva ha sido confirmada con éxito!");
		response.put("reserva", updateReserva);
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

}
