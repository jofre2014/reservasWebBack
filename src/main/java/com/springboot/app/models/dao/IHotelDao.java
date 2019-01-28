/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.dao;

import com.springboot.app.models.entity.Hotel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Romina
 */
public interface IHotelDao extends JpaRepository<Hotel, Long> {
	
	public List<Hotel> findByParadaTraslado(short traslado);
	
	public List<Hotel> findByPuntoEncuentro(short ptoEncuentro);
    
}
