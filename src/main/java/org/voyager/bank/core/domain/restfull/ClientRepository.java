package org.voyager.bank.core.domain.restfull;

import java.util.List;
import java.util.UUID;

import br.com.bradesco.core.entity.model.agencia.model.Cliente;
import br.com.bradesco.core.usecases.ClientRepositoryImpl;

public class ClientRepository implements ClientRepositoryImpl<Cliente> {

	@Override
	public boolean save(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(UUID uuid) {
		// TODO Auto-generated method stub
		return null;
	}

}
