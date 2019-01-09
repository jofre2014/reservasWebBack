package com.springboot.app.models.service;

import java.util.List;

import com.springboot.app.models.entity.Reserva;


/**
*
* @author Jose
*/

public interface IReservaService {

	List<Reserva> findAll();
}
