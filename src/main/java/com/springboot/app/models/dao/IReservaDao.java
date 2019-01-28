package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.models.entity.Reserva;

/**
*
* @author Jose
*/

public interface IReservaDao extends JpaRepository<Reserva, Integer> {

}
