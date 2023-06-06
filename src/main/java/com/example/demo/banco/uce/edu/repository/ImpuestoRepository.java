package com.example.demo.banco.uce.edu.repository;

import java.math.BigDecimal;

public interface ImpuestoRepository {

	public BigDecimal seleccionar(String codigoImpuesto);
	
}
