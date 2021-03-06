package com.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.springboot.app.dto.ReservaDTO;
import com.springboot.app.dto.ReservaPaxsDTO;
import com.springboot.app.models.entity.Reserva;


/**
*
* @author Jose
*/

public interface IReservaService {

	List<Reserva> findAll();
	
	Reserva findById(int id);
	
	Reserva save(Reserva reserva);
	
	Boolean generarReserva(List<ReservaDTO> reserva);
	
	List<Reserva> findByConfirmada(short confirmada);
	
	Page<Reserva> findConfirmadaXCliente(int cliente, short estado, Pageable pageable);
	
	ReservaPaxsDTO getReservaPaxs(int idReserva);
	
	Page<Reserva> findReservaByNombrePax(String nombrePax, Pageable pageable);

	List<Reserva> getAllReservasSinConfirmar(int cliente, short estado);
	
}
