package com.springboot.app.models.service;

import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import com.springboot.app.models.entity.GrupoCupo;

/**
 * @author jjofre
 *
 */

public interface IGrupoCupoService {

	List<GrupoCupo> findAll();
	
	// Actualizar Cupo por Fecha y Grupo
	void updateCupos(String fechaReserva, Map<Integer, Integer> cupos);
}
