package org.voyager.bank.core.entity.model.agencia.model.cliente;

import java.util.List;
import java.util.Map;

import br.com.bradesco.core.entity.model.agencia.ICliente;
import br.com.bradesco.core.entity.model.agencia.IConta;
import br.com.bradesco.core.entity.model.agencia.IEndereco;


public class Pessoa implements ICliente {

	private String nome;
	private Map<String,String> email;
	private Map<String,Integer> telefone;
	private Map<String,Integer> celular;
	private List<IEndereco> enderecos;
	private List<IConta> contas;
	private String CPF;
	private String nacionalidade;
	private String naturalidade;
	private String escolaridade;
	private String sexo;
	private String uf;
	
	
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
