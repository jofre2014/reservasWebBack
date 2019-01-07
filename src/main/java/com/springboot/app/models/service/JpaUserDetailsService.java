package com.springboot.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.models.dao.IClienteDao;
import com.springboot.app.models.dao.IUsuarioDao;
import com.springboot.app.models.entity.Cliente;
import com.springboot.app.models.entity.Role;
import com.springboot.app.models.entity.Usuario;

@Service("jpaUserDetailsService")
public class JpaUserDetailsService implements UserDetailsService{

	
	@Autowired
	private IClienteDao clienteDao;
	
	private Logger logger = LoggerFactory.getLogger(JpaUserDetailsService.class);
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
logger.error(" Cuit: " +username);
		
		Cliente cliente = clienteDao.findByCuit(username);
		
		if(cliente==null) {
			logger.error("Error en el login: no existe el cliente '" + username +"' en el sistema");
			throw new UsernameNotFoundException("Error en el login: no existe el cliente '" + username +"' en el sistema");
		}
		
		logger.error("Se encontró el cliente. Cuit: " + cliente.getCuit()+ " Cliente pass: " + cliente.getClienteInternet().getPassword());
		System.out.println("PASSWORD BD: " + cliente.getClienteInternet().getPassword());
		
		/*
		List<GrantedAuthority> authorities = cliente.getRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority()))
				.collect(Collectors.toList());		
			*/	
		
		//Defino HarCode el ROLE ADMIN
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ROLE_ADMIN"));			
		
		return new User(cliente.getCuit() , cliente.getClienteInternet().getPassword(),roles);
		
	}

}
