package org.voyager.bank.core.entity.model.agencia.conta;

import java.math.BigDecimal;

import br.com.bradesco.core.entity.model.agencia.IConta;

public class ContaPoupan�a implements IConta{
	
	private String digito;
	private BigDecimal saldo;

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
}
