package org.voyager.bank.core.usecases.plano;

import java.util.List;
import java.util.UUID;

import org.voyager.bank.core.entity.model.Plano;
import org.voyager.bank.core.usecases.PlanoRepositoryImpl;


public interface PlanoPrevidenciaRepository extends PlanoRepositoryImpl<Plano>{
	
	public boolean update(Plano cliente);
	public boolean delete();
	public List<Plano> findAll();
	public Plano findById(UUID uuid);
	public boolean save(Plano cliente);

}
