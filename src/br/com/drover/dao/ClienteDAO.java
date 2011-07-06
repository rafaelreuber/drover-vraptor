package br.com.drover.dao;

import br.com.drover.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, Long> {
	

	public Cliente save(Cliente entity);

}
