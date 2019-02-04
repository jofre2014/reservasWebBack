package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.app.models.entity.ProductoArticulo;

public interface IProductoArticuloDao extends JpaRepository<ProductoArticulo, Integer> {
	
	@Query(value="SELECT PAr_Art_ID FROM productoarticulo WHERE par_prd_id = :productoId", nativeQuery = true)
	String recuperaIdArticulo(@Param("productoId") short productoId);

}
