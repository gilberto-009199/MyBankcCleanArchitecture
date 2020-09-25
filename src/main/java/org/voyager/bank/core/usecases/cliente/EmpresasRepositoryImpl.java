package org.voyager.bank.core.usecases.cliente;

import java.util.List;
import java.util.UUID;

import br.com.bradesco.core.entity.model.agencia.model.Empresa;
import br.com.bradesco.core.usecases.ClientRepositoryImpl;

public interface EmpresasRepositoryImpl extends ClientRepositoryImpl<Empresa> {
	
	public boolean save(Empresa cliente);
	public boolean update(Empresa cliente);
	public boolean delete();
	public List<Empresa> findAll();
	public Empresa findById(UUID uuid);
	
}
