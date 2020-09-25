package org.voyager.bank.core.entity;

import java.util.List;

import br.com.bradesco.core.entity.model.agencia.IConta;
import br.com.bradesco.core.entity.model.agencia.IEndereco;

public abstract interface IAgencia {
	
	public String getNumero();
	public void setNumero(String numero);
	public IEndereco getEndereco();
	public void setEndereco(IEndereco endereco);
	public List<IConta> getContas();
	public void setContas(List<IConta> contas);
	
}
