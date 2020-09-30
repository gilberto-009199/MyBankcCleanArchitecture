package org.voyager.bank.core.entity.model.agencia.model.cliente;

import java.util.List;
import java.util.Map;

import org.voyager.bank.core.entity.model.agencia.IConta;
import org.voyager.bank.core.entity.model.agencia.IEndereco;
import org.voyager.bank.core.entity.model.agencia.model.Cliente;



public class Empresa extends Cliente {
	
	private String nome;
	private Map<String,String> email;
	private Map<String,Integer> telefone;
	private Map<String,Integer> celular;
	private List<IEndereco> enderecos;
	private List<IConta> contas;
	private String CNPJ;
	private String razaoSocial;
	private String NomeFantasia;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, String> getEmail() {
		return email;
	}

	public void setEmail(Map<String, String> email) {
		this.email = email;
	}

	public Map<String, Integer> getTelefone() {
		return telefone;
	}

	public void setTelefone(Map<String, Integer> telefone) {
		this.telefone = telefone;
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

	public List<IConta> getContas() {
		return contas;
	}

	public void setContas(List<IConta> contas) {
		this.contas = contas;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return NomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}


}
