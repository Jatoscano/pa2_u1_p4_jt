package com.example.demo.service.uce.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.uce.edu.EstudianteRepo;
import com.example.demo.repository.uce.edu.modelo.Estudiante;

@Service
public class EstudianteServicesImpl implements EstudianteServices{

	//logica del negocio
	@Autowired
	private EstudianteRepo estudianteRepository;
	
	@Override
	public void guardar(Estudiante estu) {
		
		estudianteRepository.insertar(estu);
	}

	@Override
	public void actualizar(Estudiante estu) {
		
		estudianteRepository.actualizar(estu);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		
		return estudianteRepository.seleccionar(cedula);
		
	}

	@Override
	public void borrar(String cedula) {
		
		estudianteRepository.eliminar(cedula);
	}

	@Override
	public List<Estudiante> reporteTodos() {
		
		return estudianteRepository.seleccionarTodos();
	}

}
