package org.voyager.bank.core.usecases;

import java.util.List;
import java.util.UUID;
import br.com.bradesco.core.entity.IAgencia;


public interface AgenciaRepositoryImpl {
	
	public boolean save(IAgencia cliente);
	public boolean update(IAgencia cliente);
	public boolean delete();
	public List<IAgencia> findAll();
	public IAgencia findById(UUID uuid);
	
}
