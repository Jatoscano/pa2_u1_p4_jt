package com.example.demo.banco.uce.edu.service;

import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

public interface TransferenciaService {

	public void guardar(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
	public void borrar(String numero);
	public Transferencia buscarNumero(String numero);
}
