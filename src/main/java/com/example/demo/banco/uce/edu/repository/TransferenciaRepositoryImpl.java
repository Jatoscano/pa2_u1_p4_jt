package com.example.demo.banco.uce.edu.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepo {

    public static List<Transferencia> baseDatos = new ArrayList<>();	
    
    @Override
	public void insertar(Transferencia transferencia) {
		
		baseDatos.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		
		Transferencia transferencia = this.seleccionarNumero(numero);
		baseDatos.remove(transferencia);
		
	}

	@Override
	public Transferencia seleccionarNumero(String numero) {
		
		Transferencia transferenciaEncontrada = new Transferencia();
		
		for(Transferencia transferencia: baseDatos) {
			
			//siempre evaluar por el elemento que sabemos no va a ser nulo, 
			//para evitar errores en compilacion
			
			if(numero.equals(transferencia.getNumero())) {
				transferenciaEncontrada = transferencia;
			}
		}
		return transferenciaEncontrada;
	}

	@Override
	public List<Transferencia> reporteTranferencia() {
		
		return baseDatos;
	}

	
	

}
