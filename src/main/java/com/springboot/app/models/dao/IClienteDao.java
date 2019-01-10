package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Integer>{
	
	public Cliente findByCuit(String cuit);	 

}
