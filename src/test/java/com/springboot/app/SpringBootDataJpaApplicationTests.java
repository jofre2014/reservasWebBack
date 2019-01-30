package com.springboot.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
		 
		 
		 class Foo { 
		     public int id, targetCost, actualCost; 
		     public String ref; 

		     public Foo(int id, String ref, int targetCost, int actualCost) { 
		      this.id = id; 
		      this.targetCost = targetCost; 
		      this.actualCost = actualCost; 
		      this.ref = ref; 
		     } 

		     @Override 
		     public String toString() { 
		      return String.format("Foo(%d,%s,%d,%d)",id,ref,targetCost,actualCost); 
		     } 
		    } 

		
		     List<Foo> list = Arrays.asList(
		      new Foo(1, "P1", 300, 400), 
		      new Foo(2, "P2", 600, 400), 
		      new Foo(3, "P3", 30, 20), 
		      new Foo(3, "P3", 70, 20), 
		      new Foo(1, "P1", 360, 40), 
		      new Foo(4, "P4", 320, 200), 
		      new Foo(4, "P4", 500, 900)); 

		     List<Foo> transform = list.stream() 
		      .collect(Collectors.groupingBy(foo -> foo.id)) 
		      .entrySet().stream() 
		      .map(e -> e.getValue().stream() 
		       .reduce((f1,f2) -> new Foo(f1.id,f1.ref,f1.targetCost + f2.targetCost,f1.actualCost + f2.actualCost))) 
		       .map(f -> f.get()) 
		       .collect(Collectors.toList()); 
		     System.out.println(transform); 
		    } 
		

	}


