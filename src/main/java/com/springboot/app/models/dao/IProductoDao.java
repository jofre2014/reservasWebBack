/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.dao;

import com.springboot.app.models.entity.Producto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Romina
 */
public interface IProductoDao  extends JpaRepository<Producto, Long> {
    
	public List<Producto> findByVentainternet(short activo);
}
