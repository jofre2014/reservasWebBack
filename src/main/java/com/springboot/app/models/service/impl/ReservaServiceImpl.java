package com.springboot.app.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.models.dao.IReservaDao;
import com.springboot.app.models.entity.Reserva;
import com.springboot.app.models.service.IReservaService;

/**
*
* @author Jose
*/
@Service
@Transactional(readOnly = true)
public class ReservaServiceImpl implements IReservaService{

	@Autowired IReservaDao iReservaDao;
	
	@Override
	public List<Reserva> findAll() {
		return iReservaDao.findAll();
	}
	

}
