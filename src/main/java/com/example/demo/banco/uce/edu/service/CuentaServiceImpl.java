package com.example.demo.banco.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.uce.edu.repository.CuentaRepo;
import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService{

	@Autowired
	private CuentaRepo cuentaRepo;
	
	@Override
	public void guardar(Cuenta cuenta) {
	      
		this.cuentaRepo.insertar(cuenta);
		
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		
		this.cuentaRepo.actualizar(cuenta);
	}

	@Override
	public void borrar(String numero) {
		
		this.cuentaRepo.eliminar(numero);
	}

	@Override
	public Cuenta buscarNumero(String numero) {
		
		return this.cuentaRepo.seleccionarNumero(numero);
	}

}
