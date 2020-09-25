package org.voyager.bank.core.entity.model.agencia.model;

import java.util.List;
import java.util.Map;

import br.com.bradesco.core.entity.model.agencia.ICliente;
import br.com.bradesco.core.entity.model.agencia.IConta;
import br.com.bradesco.core.entity.model.agencia.IEndereco;

public abstract class Cliente implements ICliente {

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, String> getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IConta> getContas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContas(List<IConta> contas) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEmail(Map<String, String> email) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Integer> getTelefone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTelefone(Map<String, Integer> telefone) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Integer> getCelular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCelular(Map<String, Integer> celular) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IEndereco> getEnderecos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEnderecos(List<IEndereco> enderecos) {
		// TODO Auto-generated method stub

	}

}
