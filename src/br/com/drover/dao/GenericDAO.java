package br.com.drover.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Rafael Reuber
 * @since  28/02/2011
 */
public interface GenericDAO <E, ID extends Serializable>{
	
	E find(ID id);
		
	List<E> findAll();
	
	E save(E entity);
	
	void delete(E entity);
	
	List<E> findByExample(E exampleInstance);
}
