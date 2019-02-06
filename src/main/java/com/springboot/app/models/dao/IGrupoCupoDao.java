package com.springboot.app.models.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.app.models.entity.GrupoCupo;

/**
 * @author jjofre
 *
 */
public interface IGrupoCupoDao extends JpaRepository<GrupoCupo, Integer> {
		
	@Query(value="SELECT * FROM grupocupo WHERE grc_gru_id = :grupo AND grc_desde = :fechaServicio", nativeQuery=true)
	GrupoCupo findXFechaYGrupo(@Param("grupo")  short grupoID, @Param("fechaServicio") String fechaServicio);

}
