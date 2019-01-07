/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service.impl;

import com.springboot.app.models.dao.IArticuloDao;
import com.springboot.app.models.entity.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.app.models.service.IArticuloService;

/**
 *
 * @author Romina
 */
@Service
@Transactional(readOnly = true)
public class ArticuloServiceImpl implements IArticuloService{

    @Autowired
    IArticuloDao iArticuloDao;
    
    @Override
    public List<Articulo> findAll() {
       return iArticuloDao.findAll();
    }
    
}
