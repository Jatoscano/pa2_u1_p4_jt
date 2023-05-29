package com.example.demo.repository.uce.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements EstudianteRepo{

	
	private static List<Estudiante> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estu) {
		
		baseDatos.add(estu);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// Estudiante estu = this.seleccionar(estudiante.getCedual());
		
		this.eliminar(estudiante.getCedula());
		this.insertar(estudiante);
		
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		
		Estudiante estuEncontrado = new Estudiante();
		
		for (Estudiante estu: baseDatos) {
			//if(estu.getCedula().equals(cedula)) 
			//en un caso si el elemento de la lista es nulo me dara error
			
			if(cedula.equals(estu.getCedula())) {
				estuEncontrado = estu;
			
			}
		}
		return estuEncontrado;
	}

	@Override
	public void eliminar(String cedula) {
	
		Estudiante estu = this.seleccionar(cedula);
		baseDatos.remove(estu);
	}

	@Override
	public List<Estudiante> seleccionarTodos() {
		
		return baseDatos;
	}

	
}
