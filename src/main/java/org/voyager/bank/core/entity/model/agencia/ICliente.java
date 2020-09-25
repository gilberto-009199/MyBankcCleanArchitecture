package org.voyager.bank.core.entity.model.agencia;

import java.util.List;
import java.util.Map;

public interface ICliente {

	public String getNome();
	public void setNome(String nome);
	
	public Map<String, String> getEmail();
	public List<IConta> getContas();
	
	public void setContas(List<IConta> contas);
	public void setEmail(Map<String, String> email);
	
	public Map<String, Integer> getTelefone();
	public void setTelefone(Map<String, Integer> telefone);
	
	public Map<String, Integer> getCelular();
	public void setCelular(Map<String, Integer> celular);
	
	public List<IEndereco> getEnderecos();
	public void setEnderecos(List<IEndereco> enderecos);

}
