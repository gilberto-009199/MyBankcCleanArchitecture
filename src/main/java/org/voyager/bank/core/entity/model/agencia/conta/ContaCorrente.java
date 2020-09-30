package org.voyager.bank.core.entity.model.agencia.conta;

import java.math.BigDecimal;

import org.voyager.bank.core.entity.model.agencia.IConta;

public class ContaCorrente implements IConta{
	
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
