/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.controllers;

import com.springboot.app.models.entity.GrupoProducto;
import com.springboot.app.models.service.IGrupoProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Romina
 */
@RestController
@RequestMapping("api")
public class GrupoProductoRestController {
 
    @Autowired
    private IGrupoProductoService iGrupoProductoService;

    @PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/grupoProductos")
    public List<GrupoProducto> listar() {
        return iGrupoProductoService.findAll();
    }
    
    @PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/grupoProductos/{prodID}")
    public GrupoProducto findGrupoXProducto(@PathVariable int prodID){
   
    	return iGrupoProductoService.findGrupoXProducto(prodID);
    }
}
