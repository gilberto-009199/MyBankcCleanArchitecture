package org.voyager.bank.core.usecases.plano;

import java.util.List;
import java.util.UUID;

import br.com.bradesco.core.entity.model.Plano;
import br.com.bradesco.core.entity.model.agencia.conta.ContaCorrente;
import br.com.bradesco.core.usecases.PlanoRepositoryImpl;

public interface PlanoPrevidenciaRepository extends PlanoRepositoryImpl<Plano>{
	
	public boolean save(Plano cliente);
	public boolean update(Plano cliente);
	public boolean delete();
	public List<Plano> findAll();
	public Plano findById(UUID uuid);

}
