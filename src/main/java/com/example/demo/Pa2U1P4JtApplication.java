package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.uce.edu.repository.modelo.Cajero;
import com.example.demo.banco.uce.edu.repository.modelo.Impuesto;
import com.example.demo.banco.uce.edu.repository.modelo.Presidente;
import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;
import com.example.demo.banco.uce.edu.service.CargaSistemaService;
import com.example.demo.banco.uce.edu.service.TransferenciaService;

@SpringBootApplication
public class Pa2U1P4JtApplication implements CommandLineRunner{
	
	
	
	@Autowired
	private Cajero cajero;
	
	@Autowired
	private Cajero cajero1;
	
	@Autowired
	private Presidente presidente;
	
	@Autowired
	private Presidente presidente1;
	
	@Autowired
	private CargaSistemaService cargaSistemaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		
		this.cajero.setApellido("Toscano");
		this.cajero.setNombre("Juan");
		this.cajero.setSalario(new BigDecimal(100));
	
		this.cajero1.setApellido("Teran");
		
		System.out.println(this.cajero);
		System.out.println(this.cajero1);
		System.out.println(this.cajero1.getApellido());
		
		this.presidente.setApellido("Lasso");
		this.presidente.setNombre("Memo");
		this.presidente.setCedula("1234567890");
		
		this.presidente1.setApellido("Noboa");
		
		System.out.println(this.presidente);
		System.out.println(this.presidente1);
		
		
		System.out.println("\n********Segunda parte del Taller 11**************");
		
		this.cargaSistemaService.cargar();
		Transferencia transferencia = new Transferencia();
		transferencia.setCuentaOrigen(null);
		transferencia.setCuentaDestino(null);
		transferencia.setFecha(LocalDateTime.now());
		transferencia.setMonto(new BigDecimal(100));
		transferencia.setNumero("1234");
		this.transferenciaService.guardar(transferencia);
	
	}

}
