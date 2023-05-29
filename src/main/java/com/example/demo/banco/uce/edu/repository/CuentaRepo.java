package com.example.demo.banco.uce.edu.repository;

import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;

public interface CuentaRepo {

	public void insertar (Cuenta cuenta);
	public void actualizar (Cuenta cuenta);
	public void eliminar (String numero);
	public Cuenta seleccionarNumero (String numero);
	

}
