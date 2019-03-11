/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service.impl;

import com.springboot.app.components.IAuthenticationFacade;
import com.springboot.app.dto.CuposDisponibleDTO;
import com.springboot.app.models.dao.IClienteGrupoCupoDao;
import com.springboot.app.models.dao.IGrupoDao;
import com.springboot.app.models.entity.ClienteGrupoCupo;
import com.springboot.app.models.entity.Grupo;
import com.springboot.app.models.service.IClienteGrupoCupoService;
import com.springboot.app.models.service.JpaUserDetailsService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
   
	private Logger logger = LoggerFactory.getLogger(ClienteGrupoCupoServiceImpl.class);
	
    @Autowired
	IClienteGrupoCupoDao iClienteGrupoCupoDao;
    
    @Autowired IGrupoDao iGrupoDao;

    @Autowired IAuthenticationFacade iAuthenticationFacade;	
    
    @Override
    public List<ClienteGrupoCupo> findAll() {
            return iClienteGrupoCupoDao.findAll();
    }
 
    /**
    *
    * @author Jose
    */
    
   	@Override
   	public List<CuposDisponibleDTO> findCupos(String fecha_reserva) {
   		
   		logger.info("Fecha de reserva/servicio" + fecha_reserva);
   		
   		Long codigo = Long.valueOf(iAuthenticationFacade.getAuthentication().getPrincipal().toString());
   		
   		List<Grupo> gruposInternet = new ArrayList<Grupo>();  		
   		gruposInternet = iGrupoDao.recuperaGruposInternet();
   		   		
   		//Calcular cantidad de dias a la reserva
   		LocalDate fecha_actual = LocalDate.now();
   		Integer cantDias = obtenerCantidadDias(fecha_actual, fecha_reserva);
   		
   	
   		
   		logger.info("Cantidad de dias" + cantDias);
   		
   		List<CuposDisponibleDTO> cupDisponibles = gruposInternet.stream().
   				map(e -> new CuposDisponibleDTO(e.getNombre(),iClienteGrupoCupoDao.recuperaCupos(codigo, (long) e.getGrupoID(), (cantDias < 0 ? 0 : cantDias)), e.getGrupoID()))
   				.collect(Collectors.toList());
   		
   		return cupDisponibles;
   	}
   		
   	private Integer obtenerCantidadDias(LocalDate fecha_actual, String fecha_res) {
   		
   		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
   		LocalDate fecha_reserva = LocalDate.parse(fecha_res, df);		 
   				
   		return (int) ChronoUnit.DAYS.between((Temporal) fecha_actual, fecha_reserva);
   	}
	
	
}
