package org.voyager.bank.core.usecases.conta;

import java.util.List;
import java.util.UUID;

import br.com.bradesco.core.entity.model.agencia.conta.ContaCorrente;
import br.com.bradesco.core.entity.model.agencia.conta.ContaPoupan�a;
import br.com.bradesco.core.usecases.ContaRepositoryImpl;

public interface ContaPoupan�aRepositoryImpl extends ContaRepositoryImpl<ContaPoupan�a>{
	
	public boolean save(ContaCorrente cliente);
	public boolean update(ContaCorrente cliente);
	public boolean delete();
	public List<ContaPoupan�a> findAll();
	public ContaPoupan�a findById(UUID uuid);
	
}
