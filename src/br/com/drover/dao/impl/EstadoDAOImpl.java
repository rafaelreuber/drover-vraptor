package br.com.drover.dao.impl;

import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.drover.dao.EstadoDAO;
import br.com.drover.entity.Estado;

/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 08/03/2011 
 */
@Component
public class EstadoDAOImpl extends GenericDAOImpl<Estado, Integer>  implements EstadoDAO  {

	public EstadoDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
}
