package org.voyager.bank.core.usecases.cliente;

import java.util.List;
import java.util.UUID;

import br.com.bradesco.core.entity.model.agencia.model.cliente.Pessoa;
import br.com.bradesco.core.usecases.ClientRepositoryImpl;

public interface PessoasRepositoryImpl extends ClientRepositoryImpl<Pessoa>{
	
	public boolean save(Pessoa cliente);
	public boolean update(Pessoa cliente);
	public boolean delete();
	public List<Pessoa> findAll();
	public Pessoa findById(UUID uuid);
	
}
