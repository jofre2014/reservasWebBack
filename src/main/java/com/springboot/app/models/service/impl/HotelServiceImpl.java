/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service.impl;

import com.springboot.app.models.dao.IHotelDao;
import com.springboot.app.models.entity.Hotel;
import com.springboot.app.models.service.IHotelService;
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
public class HotelServiceImpl implements IHotelService{

     @Autowired
     IHotelDao iHotelDao;
     
    @Override
    public List<Hotel> findAll() {
        return iHotelDao.findAll();
    }

	@Override
	public List<Hotel> getHotelTraslado(short traslado) {
		return iHotelDao.findByParadaTraslado(traslado);
	}

	@Override
	public List<Hotel> getHotelPtoEncuentro(short ptoEncuentro) {
		return iHotelDao.findByPuntoEncuentro(ptoEncuentro);
	}

	@Override
	public List<Hotel> getHotelTrasladoPtoEncuentro(short traslado, short ptoEncuentro) {
		
		if(traslado == 1) {		
			return iHotelDao.findByParadaTraslado(traslado);
		}else if(ptoEncuentro == 1) {		
			return iHotelDao.findByPuntoEncuentro(ptoEncuentro);
		}
		
		return null;
	}
    
    
    
}
