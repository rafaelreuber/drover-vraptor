package br.com.drover.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.drover.dao.CidadeDAO;
import br.com.drover.entity.Cidade;
import br.com.drover.entity.Estado;

/**
 * Drover
 * 
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 09/03/2011
 */
@Component
public class CidadeDAOImpl extends GenericDAOImpl<Cidade, Integer> implements
		CidadeDAO {

	public CidadeDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public List<Cidade> listByEstado(Estado estado) {
		
		@SuppressWarnings("unchecked")
		List<Cidade> cidades = getHibernateTemplate().find("from Cidade where estado_Id = " + estado.getId());

		return cidades;
	}

}
