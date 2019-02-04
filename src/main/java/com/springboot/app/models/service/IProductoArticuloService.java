package com.springboot.app.models.service;

import java.util.List;

import com.springboot.app.models.entity.ProductoArticulo;

/**
 * @author jjofre
 *
 */
public interface IProductoArticuloService {
		List<ProductoArticulo> findAll();
}
