package org.voyager.bank.core.usecases;

import java.util.List;
import java.util.UUID;

public interface ContaRepositoryImpl<T>{
	
	public boolean save(T cliente);
	public boolean update(T cliente);
	public boolean delete();
	public List<T> findAll();
	public T findById(UUID uuid);
	
}
