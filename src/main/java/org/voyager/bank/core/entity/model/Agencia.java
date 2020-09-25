package org.voyager.bank.core.entity.model;

import java.util.List;

import br.com.bradesco.core.entity.IAgencia;
import br.com.bradesco.core.entity.model.agencia.IConta;
import br.com.bradesco.core.entity.model.agencia.IEndereco;

public class Agencia implements IAgencia{
	
	private String numero;
	private IEndereco endereco;
	private List<IConta> contas;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public IEndereco getEndereco() {
		return endereco;
	}
	public void setEndereco(IEndereco endereco) {
		this.endereco = endereco;
	}
	public List<IConta> getContas() {
		return contas;
	}
	public void setContas(List<IConta> contas) {
		this.contas = contas;
	}
	
	
}
