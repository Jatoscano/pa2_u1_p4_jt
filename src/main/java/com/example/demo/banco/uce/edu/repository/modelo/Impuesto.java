package com.example.demo.banco.uce.edu.repository.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // manera mas segura y por defecto si no se coloca
// por defecto en la actualidad se da singleton actualizacion 2022
//@Scope("prototype") // manera manual, siempre y cuando sea con minuscula
public class Impuesto {

	private BigDecimal salario;

	@Override
	public String toString() {
		return "Impuesto [salario=" + salario + "]";
	}

	//get and set
	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
}
