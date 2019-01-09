/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.app.models.entity.ClienteGrupoCupo;

/**
 *
 * @author Romina
 */
public interface IClienteGrupoCupoDao extends JpaRepository <ClienteGrupoCupo, Long>{
    
	@Query(value="SELECT MAX(cantidad) FROM clientegrupocupo\r\n" + 
			"WHERE cliente_id = :codigo\r\n" + 
			"AND grupo_id = :grupo\r\n" + 
			"AND :dias >= dias", nativeQuery=true)
	int recuperaCupos(@Param("codigo") Long codigo, @Param("grupo") Long grupo, @Param("dias") int dias);

	
	
}


