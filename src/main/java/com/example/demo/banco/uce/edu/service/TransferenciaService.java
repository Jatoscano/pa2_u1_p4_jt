package com.example.demo.banco.uce.edu.service;

import java.math.BigDecimal;

import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

public interface TransferenciaService {

	public void guardar(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
	public void borrar(String numero);
	public Transferencia buscarNumero(String numero);
	
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto);
}
