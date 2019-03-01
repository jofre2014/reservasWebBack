package com.springboot.app.models.service.impl;

import java.util.Date;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.excepciones.ResourceNotFoundException;
import com.springboot.app.models.dao.IGrupoCupoDao;
import com.springboot.app.models.entity.GrupoCupo;
import com.springboot.app.models.service.IGrupoCupoService;

@Service
public class GrupoCupoServiceImpl implements IGrupoCupoService {

	@Autowired
	IGrupoCupoDao iGrupoCupoDao;

	@Override
	public List<GrupoCupo> findAll() {
		// TODO Auto-generated method stub
		return iGrupoCupoDao.findAll();
	}

	@Override
	public void updateCupos(String fechaServicio, Map<Integer, Integer> cupos, Boolean resta) {
		System.out.println("FechaServicio: " + fechaServicio);
		cupos.forEach((k, v) -> {

			GrupoCupo grupoCupo = iGrupoCupoDao.findXFechaYGrupo(k.shortValue(), fechaServicio);
			if (grupoCupo == null) {
				throw new ResourceNotFoundException((long) 0, "No se encontraron cupos");
			}

			if (resta) {
				grupoCupo.setCantidad((short) (grupoCupo.getCantidad() - v));
			} else {
				grupoCupo.setCantidad((short) (grupoCupo.getCantidad() + v));
			}

			iGrupoCupoDao.save(grupoCupo);

		});

	}

}
