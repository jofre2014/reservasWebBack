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
import com.springboot.app.models.entity.ClienteInternet;
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
		
		ClienteInternet cliInternet = cliente.getClienteInternet();
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        
        for(Role role: cliInternet.getRoles()) {
        	logger.info("Role: ".concat(role.getAuthority()));
        	authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
        }
        
        /*if(authorities.isEmpty()) {
        	logger.error("Error en el Login: Usuario '" + username + "' no tiene roles asignados!");
        	throw new UsernameNotFoundException("Error en el Login: usuario '" + username + "' no tiene roles asignados!");
        }*/	
		
		return new User( String.valueOf(cliInternet.getClienteID()) , cliInternet.getPassword(), authorities );
		
	}

}
