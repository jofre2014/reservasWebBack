package com.springboot.app;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.app.models.dao.IClienteDao;
import com.springboot.app.models.entity.Cliente;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaApplicationTests {
	
	@Autowired
	private IClienteDao clienteDao;
	

	@Test
	public void contextLoads() {
		
		String username = "7";
		
		System.out.println("EN modo test R");
		
	     Optional<Cliente> cliente = clienteDao.findById( Integer.valueOf( username ) );
		
		 if ( cliente.isPresent() ){
			  System.out.println("**** " + cliente.get() );
		 }
		

	}

}
