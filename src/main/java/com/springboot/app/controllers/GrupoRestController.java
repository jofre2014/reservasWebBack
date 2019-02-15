/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.controllers;

import com.springboot.app.models.entity.Grupo;
import com.springboot.app.models.service.IGrupoService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Romina
 */
@RestController
@RequestMapping("api")
public class GrupoRestController {
    
    @Autowired
    private IGrupoService iGrupoService;

    @PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/grupos")
    public List<Grupo> listar() {
        return iGrupoService.findAll();
    }
    
    @PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
    @PostMapping(value = "/grupos/grupo")
    public List<Grupo> productosXGrupo(@RequestBody List<Integer> grupoid) {
    	System.out.println("En el servicio de gruposss!! " +grupoid);
        return iGrupoService.findByGrupoIDIn( grupoid);
    }
    
}
