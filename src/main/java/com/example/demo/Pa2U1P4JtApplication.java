package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.uce.edu.modelo.Estudiante;
import com.example.demo.service.uce.edu.EstudianteServices;

@SpringBootApplication
public class Pa2U1P4JtApplication implements CommandLineRunner{

    @Autowired
    private EstudianteServices estudianteServices;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//guardar estudiantes
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Toscano");
		miEstudiante.setCedula("1724693740");
		miEstudiante.setNombre("Juan");
		miEstudiante.setFecha(LocalDateTime.of(1996, 9, 13, 19, 07));
		
		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("Coyago");
		miEstudiante1.setCedula("1734657809");
		miEstudiante1.setNombre("Henry");
		miEstudiante1.setFecha(LocalDateTime.of(1996, 9, 13, 19, 07));
		
		// 1. Voy a guardar estudiante
		this.estudianteServices.guardar(miEstudiante);
		this.estudianteServices.guardar(miEstudiante1);
		
		//5. Reporte
		
		List<Estudiante> reporte = estudianteServices.reporteTodos();
		System.out.println("Reporte: ");
		
		for(Estudiante estu: reporte) {
			System.out.println(estu);
		}
		
		//2. actualizar
		miEstudiante1.setApellido("Cayambe");
		this.estudianteServices.actualizar(miEstudiante1);
		
		
		      //5. reporte
		List<Estudiante> reporte2 = estudianteServices.reporteTodos();
		System.out.println("Reporte: ");
		
		for(Estudiante estu: reporte2) {
		
			System.out.println(estu);
		}
		
	
		
		//4. actualizar
		this.estudianteServices.borrar("1723984509");
		
		List<Estudiante> reporte3 = estudianteServices.reporteTodos();
		System.out.println("Reporte");
		
		for(Estudiante estu: reporte3) {
			
			System.out.println(estu);
		}
		
		//imprimir reporte
		System.out.println("Reporte de todos los estudiantes");
		//buscar por cedula, de una ceudla no existente
		
		Estudiante miEstud1 = this.estudianteServices.buscarPorCedula("1724693740");
		Estudiante miEstud2 = this.estudianteServices.buscarPorCedula("172469374");
		
		System.out.println(miEstud1);
		System.out.println(miEstud2);
		
	}

}
