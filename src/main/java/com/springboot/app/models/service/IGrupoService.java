/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service;

import com.springboot.app.models.entity.Grupo;
import java.util.List;

/**
 *
 * @author Romina
 */
public interface IGrupoService {
     List<Grupo> findAll(); 
     
     List<Grupo> findByGrupoIDIn(List<Integer> grupoId);
}
