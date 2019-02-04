package com.springboot.app.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.app.models.dao.IProductoArticuloDao;
import com.springboot.app.models.entity.ProductoArticulo;
import com.springboot.app.models.service.IProductoArticuloService;

public class ProductoArticuloServiceImpl implements IProductoArticuloService{

	@Autowired IProductoArticuloDao iProductoArticuloDao;
	
	@Override
	public List<ProductoArticulo> findAll() {
		
		return iProductoArticuloDao.findAll();
	}

}
