package com.example.demo.repository.uce.edu;

import java.util.List;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

public interface EstudianteRepo {

	public void insertar (Estudiante estu);
	public void actualizar (Estudiante estu);
	public Estudiante seleccionar (String cedula); //se busca por el identificador
	public void eliminar (String cedula);// se elimina por un identificador
	public List<Estudiante> seleccionarTodos();
}
