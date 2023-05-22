package com.example.demo.repository.uce.edu;

import com.example.demo.modelo.uce.edu.Estudiante;

public interface EstudianteRepo {

	public void insertar (Estudiante estu);
	public void actualizar (Estudiante estu);
	public void seleccionar (String cedula);
	public void eliminar (String cedula);
}
