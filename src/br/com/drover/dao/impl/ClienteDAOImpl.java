package br.com.drover.dao.impl;


import org.hibernate.SessionFactory;
import br.com.caelum.vraptor.ioc.Component;
import br.com.drover.dao.ClienteDAO;
import br.com.drover.entity.Cliente;


@Component
public class ClienteDAOImpl extends GenericDAOImpl <Cliente, Long> implements ClienteDAO {

	public ClienteDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	

}
