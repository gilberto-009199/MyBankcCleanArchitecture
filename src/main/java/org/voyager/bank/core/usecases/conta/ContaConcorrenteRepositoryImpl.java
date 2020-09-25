package org.voyager.bank.core.usecases.conta;

import java.util.List;
import java.util.UUID;

import br.com.bradesco.core.entity.model.agencia.conta.ContaCorrente;
import br.com.bradesco.core.usecases.ContaRepositoryImpl;

public interface ContaConcorrenteRepositoryImpl extends ContaRepositoryImpl<ContaCorrente>{
	
	public boolean save(ContaCorrente cliente);
	public boolean update(ContaCorrente cliente);
	public boolean delete();
	public List<ContaCorrente> findAll();
	public ContaCorrente findById(UUID uuid);
	
}
