/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service.impl;

import com.springboot.app.models.dao.IReservaArticuloDao;
import com.springboot.app.models.entity.ReservaArticulo;
import com.springboot.app.models.service.IReservaArticuloService;
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
public class ReservaArticuloServiceImpl implements IReservaArticuloService{
    
    @Autowired
    IReservaArticuloDao iReservaArticuloDao;

    @Override
    public List<ReservaArticulo> findAll() {
        return iReservaArticuloDao.findAll();
    }
    
    
}
