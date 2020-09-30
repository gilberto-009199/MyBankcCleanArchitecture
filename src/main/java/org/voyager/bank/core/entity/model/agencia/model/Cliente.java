package org.voyager.bank.core.entity.model.agencia.model;

import java.util.List;
import java.util.Map;

import org.voyager.bank.core.entity.model.agencia.ICliente;
import org.voyager.bank.core.entity.model.agencia.IConta;
import org.voyager.bank.core.entity.model.agencia.IEndereco;


public abstract class Cliente implements ICliente {
	
	private String nome;
	
	private Map<String, String> emails;
	
	private List<IConta> contas;
			
	private Map<String, Integer> Telefone;
	
	private Map<String, Integer> celular;
		
	private List<IEndereco> enderecos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, String> getEmails() {
		return emails;
	}

	public void setEmails(Map<String, String> emails) {
		this.emails = emails;
	}

	public List<IConta> getContas() {
		return contas;
	}

	public void setContas(List<IConta> contas) {
		this.contas = contas;
	}

	public Map<String, Integer> getTelefone() {
		return Telefone;
	}

	public void setTelefone(Map<String, Integer> telefone) {
		Telefone = telefone;
	}

	public Map<String, Integer> getCelular() {
		return celular;
	}

	public void setCelular(Map<String, Integer> celular) {
		this.celular = celular;
	}

	public List<IEndereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<IEndereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
