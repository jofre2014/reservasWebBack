package com.springboot.app.components;

import org.springframework.security.core.Authentication;

public interface IAuthenticationFacade {
	
	 Authentication getAuthentication();

}
