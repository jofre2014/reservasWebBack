/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service.impl;

import com.springboot.app.models.dao.IGrupoDao;
import com.springboot.app.models.entity.Grupo;
import com.springboot.app.models.service.IGrupoService;
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
public class GrupoServiceImpl implements IGrupoService{

    @Autowired
    IGrupoDao iGrupoDao;
    
    @Override
    public List<Grupo> findAll() {
      return  iGrupoDao.findAll();
    }

	@Override
	public List<Grupo> findByGrupoIDIn(List<Integer> grupoId) {
		// TODO Auto-generated method stub
		return iGrupoDao.findByGrupoIDIn(grupoId);
	}
    
}
