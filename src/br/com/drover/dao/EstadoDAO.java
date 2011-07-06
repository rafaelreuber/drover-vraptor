package br.com.drover.dao;

import java.util.List;

import br.com.drover.entity.Estado;

/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 08/03/2011 
 */
public interface EstadoDAO extends GenericDAO<Estado, Integer> {
	

	public List<Estado> findAll();

}
