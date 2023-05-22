package com.example.demo.repository.uce.edu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.uce.edu.Estudiante;

@Repository
public class EstudianteRepoImpl implements EstudianteRepo{

	
	private static List<Estudiante> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Estudiante estu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Estudiante estu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seleccionar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	
}
