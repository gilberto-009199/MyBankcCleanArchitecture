package org.voyager.bank.core.domain.dao;

import java.util.List;
import java.util.UUID;

import br.com.bradesco.core.entity.model.Plano;
import br.com.bradesco.core.usecases.plano.PlanoPrevidenciaRepository;

public class PlanoPrevidenciaDAO implements PlanoPrevidenciaRepository{
		
	@Override
	public boolean save(Plano cliente) {
		
		String procedure = "exec NomeProcedure ?,?,?,?";
		
		
		return false;
	}

	@Override
	public boolean update(Plano cliente) {
		String procedure = "exec NomeProcedure ?,?,?,?";
		return false;
	}

	@Override
	public boolean delete() {
		
		String procedure = "exec NomeProcedure ?,?,?,?";
		
		return false;
	}

	@Override
	public List<Plano> findAll() {
		String procedure = "exec NomeProcedure ?,?,?,?";
		return null;
	}

	@Override
	public Plano findById(UUID uuid) {
		String procedure = "exec NomeProcedure ?,?,?,?";
		return null;
	}
	
	
	
}
