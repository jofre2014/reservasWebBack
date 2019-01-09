/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service.impl;

import com.springboot.app.models.dao.IClienteGrupoCupoDao;
import com.springboot.app.models.entity.ClienteGrupoCupo;
import com.springboot.app.models.service.IClienteGrupoCupoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Romina
 */
@Service
@Transactional(readOnly = true)
public class ClienteGrupoCupoServiceImpl implements IClienteGrupoCupoService{
   
    @Autowired
	IClienteGrupoCupoDao iClienteGrupoCupoDao;

    @Override
    public List<ClienteGrupoCupo> findAll() {
            return iClienteGrupoCupoDao.findAll();
    }
 
    /**
    *
    * @author Jose
    */
    
   	@Override
   	public Integer findCupos(Long codigo, Long grupo,  String fecha_reserva) {
   		
   		//Calcular cantidad de dias a la reserva
   		LocalDate fecha_actual = LocalDate.now();
   		
   		Integer cantDias = obtenerCantidadDias(fecha_actual, fecha_reserva);
   		   			
   		return iClienteGrupoCupoDao.recuperaCupos(codigo, grupo, cantDias);
   	}
   		
   	private Integer obtenerCantidadDias(LocalDate fecha_actual, String fecha_res) {
   		
   		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
   		LocalDate fecha_reserva = LocalDate.parse(fecha_res, df);		 
   				
   		return (int) ChronoUnit.DAYS.between((Temporal) fecha_actual, fecha_reserva);
   	}
	
	
}
