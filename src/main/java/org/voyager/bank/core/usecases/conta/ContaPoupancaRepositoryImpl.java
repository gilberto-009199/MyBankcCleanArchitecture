package org.voyager.bank.core.usecases.conta;

import java.util.List;
import java.util.UUID;

import org.voyager.bank.core.entity.model.agencia.conta.ContaPoupanca;
import org.voyager.bank.core.usecases.ContaRepositoryImpl;

public interface ContaPoupancaRepositoryImpl extends ContaRepositoryImpl<ContaPoupanca>{
	
	public boolean save(ContaPoupanca cliente);
	public boolean update(ContaPoupanca cliente);
	public boolean delete();
	public List<ContaPoupanca> findAll();
	public ContaPoupanca findById(UUID uuid);
	
}
