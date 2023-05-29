package com.example.demo.service.uce.edu;

import java.util.List;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

public interface EstudianteServices {

	public void guardar (Estudiante estu);
	public void actualizar (Estudiante estu);
	public Estudiante buscarPorCedula (String cedula);//se busca por el identifcador
	public void borrar (String cedula);//se elimina por un identificador
	public List<Estudiante> reporteTodos();
}
