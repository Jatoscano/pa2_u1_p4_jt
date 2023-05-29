package com.example.demo.banco.uce.edu.service;

import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;

public interface CuentaService {

	public void guardar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public void borrar(String numero);
	public Cuenta buscarNumero(String numero);
}
