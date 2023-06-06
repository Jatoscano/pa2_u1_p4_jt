package com.example.demo.banco.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.banco.uce.edu.repository.CuentaRepo;
import com.example.demo.banco.uce.edu.repository.TransferenciaRepo;
import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;
import com.example.demo.banco.uce.edu.repository.modelo.Impuesto;
import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
public class TransfernciaServiceImpl implements TransferenciaService {

	
	@Autowired
	private TransferenciaRepo transferenciaRepo;
	
	@Autowired
	private CuentaRepo cuentaRepo;
	
	@Autowired
	@Qualifier("Internacional")
	private MontoDebitarService montoDebitarService;
	
	@Autowired
	private Impuesto impuesto;

	@Override
	public void guardar(Transferencia transferencia) {
		
		System.out.println("La transferencia se va a calcular con el IVA: ");
		System.out.println(impuesto.getSalario());
		this.transferenciaRepo.insertar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		
		this.transferenciaRepo.actualizar(transferencia);
	}

	@Override
	public void borrar(String numero) {
		
		this.transferenciaRepo.eliminar(numero);
	}

	@Override
	public Transferencia buscarNumero(String numero) {
		
		return this.transferenciaRepo.seleccionarNumero(numero);
	}

	@Override
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto) {
		//1. consultar la cuenta de origen por el numero de cuenta
		Cuenta cuentaOrigen = cuentaRepo.seleccionarNumero(numeroCuentaDestino);
		
		//2. consultar el saldo de la uenta origen
		BigDecimal saldoOrigen =  cuentaOrigen.getSaldo();
		
		BigDecimal montoDebitar = this.montoDebitarService.calcular(monto);
		
		//3. validar si el saldo es suficiente
		if(monto.compareTo(saldoOrigen) <= 0) {
			//5.  si es suficiente ir al paso 6
			//6.  realizar la resta del saldo origen - monto
			BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(montoDebitar);
			//7.  actualizar el nuevo saldo de la cuenta origen
			cuentaOrigen.setSaldo(nuevoSaldoOrigen);
			//8.  consultamos la cuenta de destino por el numero
			Cuenta cuentaDestino = cuentaRepo.seleccionarNumero(numeroCuentaOrigen);
			//9.  consultamos el saldo de la cuenta destino
			BigDecimal saldoDestino = cuentaDestino.getSaldo();
			//10. relaizamos la suma del saldo destino + monto
			BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		//11. actualizamos el nuevo saldo de la cuenta destino
		cuentaDestino.setSaldo(nuevoSaldoDestino);
		this.cuentaRepo.actualizar(cuentaDestino);
		
		//12. creamos la transderecnia
		Transferencia transfer = new Transferencia();
		transfer.setCuentaOrigen(cuentaOrigen);
		transfer.setCuentaDestino(cuentaDestino);
		transfer.setMonto(monto);
		Double numero = Math.random(); 
		transfer.setNumero(numero.toString());
		transfer.setFecha(LocalDateTime.now());
		this.transferenciaRepo.insertar(transfer);
		
		}
		else {
			//4. si no es sifuciente imprimir mensaje de que no hya saldo
			System.out.println("Su saldo no es suficiente, su saldo es de : "
					+ saldoOrigen);
		}
		
	}
	
	
	

}
