package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4JtApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Mi primer Proyecto");
		
		/*Spring Framework, permite la construccion
		 * y desarrollo de aplicaciones empresairales
		 * basadas en Spring
		 */
		
		/* Se realizo un cambio en la rama Taller3
		 */
		
		Profesor profesor = new Profesor();
		profesor.setApellido("Toscano");
		profesor.setCedula("1723457609");
		profesor.setFechaNacimiento(LocalDateTime.now());
		profesor.setNombre("Juan");
		
		
		System.out.println(profesor);
	}
	
	

}
