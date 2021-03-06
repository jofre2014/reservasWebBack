package com.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.app.models.entity.Reserva;

/**
*
* @author Jose
*/

public interface IReservaDao extends JpaRepository<Reserva, Integer> {

	List<Reserva> findByConfirmada(short confirmada);
	
	@Query(value = "SELECT * FROM reserva WHERE Res_Cli_ID = :cliente AND Res_Confirmada = :estado",nativeQuery = true)
	Page<Reserva> findConfirmadaXCliente(@Param("cliente") int cliente, @Param("estado") short estado, Pageable pageale);
	
	Page<Reserva> findReservaByNombrepaxStartingWith(String nombrepax, Pageable pageable);

	List<Reserva> findByConfirmadaAndClienteID(short confirmada, int cliente);
}
