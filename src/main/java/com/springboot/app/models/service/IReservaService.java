package com.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot.app.dto.ReservaDTO;
import com.springboot.app.models.entity.Reserva;


/**
*
* @author Jose
*/

public interface IReservaService {

	List<Reserva> findAll();
	
	Boolean generarReserva(List<ReservaDTO> reserva);
	
	List<Reserva> findByConfirmada(short confirmada);
	
	Page<Reserva> findConfirmadaXCliente(int cliente, short estado, Pageable pageable);
}
