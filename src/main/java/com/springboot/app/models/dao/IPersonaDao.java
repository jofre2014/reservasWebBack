package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.app.models.entity.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

}
