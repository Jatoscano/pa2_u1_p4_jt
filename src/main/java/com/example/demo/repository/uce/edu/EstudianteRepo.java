package com.example.demo.repository.uce.edu;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

public interface EstudianteRepo {

	public void insertar (Estudiante estu);
	public void actualizar (Estudiante estu);
	public Estudiante seleccionar (String cedula);
	public void eliminar (String cedula);
}
