package com.springboot.app.models.service;

import java.util.List;

import com.springboot.app.models.entity.Persona;

public interface IPersonaService {
	
	List<Persona> findAll();

}
