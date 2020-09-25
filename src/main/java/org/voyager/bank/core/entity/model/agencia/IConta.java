package org.voyager.bank.core.entity.model.agencia;

import java.math.BigDecimal;

public interface IConta {
	
	
	public String getDigito();

	public void setDigito(String digito);
	
	public BigDecimal getSaldo();

	public void setSaldo(BigDecimal saldo);
	
}
