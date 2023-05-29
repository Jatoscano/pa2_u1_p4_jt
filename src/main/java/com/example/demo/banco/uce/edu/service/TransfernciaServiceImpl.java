package com.example.demo.banco.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.uce.edu.repository.TransferenciaRepo;
import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

@Service
public class TransfernciaServiceImpl implements TransferenciaService {

	
	@Autowired
	private TransferenciaRepo transferenciaRepo;

	@Override
	public void guardar(Transferencia transferencia) {
		
		this.transferenciaRepo.insertar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		
		this.transferenciaRepo.actualizar(transferencia);
	}

	@Override
	public void borrar(String numero) {
		
		this.transferenciaRepo.eliminar(numero);
	}

	@Override
	public Transferencia buscarNumero(String numero) {
		
		return this.transferenciaRepo.seleccionarNumero(numero);
	}
	
	

}
