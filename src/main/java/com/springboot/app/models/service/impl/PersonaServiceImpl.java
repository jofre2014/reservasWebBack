package com.springboot.app.models.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.models.dao.IPersonaDao;
import com.springboot.app.models.entity.Persona;
import com.springboot.app.models.service.IPersonaService;

@Service
@Transactional(readOnly = true)
public class PersonaServiceImpl implements IPersonaService {	
	
	@Autowired
	IPersonaDao iPersonaDao;
	
	@Override	
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return iPersonaDao.findAll();
	}

	@Override
	public Persona savePersona(Persona persona) {
		return persona;
	}

}
