package com.example.demo.banco.uce.edu.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("Nacional")
public class MontoDebitarNacionalServiceImpl implements MontoDebitarService{

	@Override
	public BigDecimal calcular(BigDecimal monto) {
	
		return monto;
	}

}
