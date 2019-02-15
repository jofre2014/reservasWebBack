/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.dao;

import com.springboot.app.models.entity.Grupo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Romina
 */
public interface IGrupoDao extends JpaRepository<Grupo, Integer>{
	
	@Query(value="SELECT * FROM grupo WHERE venta_internet = 1", nativeQuery=true)
	List<Grupo> recuperaGruposInternet();
    
	List<Grupo> findByGrupoIDIn(List<Integer> grupoId);
	
	List<Grupo> findAllByGrupoID(List<Integer> grupoId);
	

}
