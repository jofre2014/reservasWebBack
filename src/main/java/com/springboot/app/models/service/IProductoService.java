/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service;

import com.springboot.app.models.entity.Producto;
import java.util.List;

/**
 *
 * @author Romina
 */
public interface IProductoService {
     List<Producto> findAll();

	 List<Producto> getProductosInternet(short activo);
}
