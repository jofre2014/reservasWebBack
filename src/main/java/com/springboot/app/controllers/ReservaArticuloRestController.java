package com.springboot.app.controllers;

import com.springboot.app.models.entity.ReservaArticulo;
import com.springboot.app.models.service.IReservaArticuloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Romina
 */
@RestController
@RequestMapping("api")
public class ReservaArticuloRestController {
     @Autowired
     IReservaArticuloService iReservaArticuloService;
     
     @PreAuthorize("isAuthenticated() and hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/reservaArticulo")
    public List<ReservaArticulo> listar() {
        return iReservaArticuloService.findAll();
    }
     
}
