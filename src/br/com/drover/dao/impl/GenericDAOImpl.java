package br.com.drover.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.drover.dao.GenericDAO;

/**
 * 
 * @author Rafael Reuber
 * @since  28/02/2011
 */
public abstract class GenericDAOImpl<E, ID extends Serializable> implements GenericDAO<E, ID>  {
	
	private Class<E> persistenClass;
	
	private HibernateTemplate hibernateTemplate;
	
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
		this.persistenClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}	

	public Class<E> getPersistenClass() 
	{
		return persistenClass;
	}

	public void setPersistenClass(Class<E> persistenClass) 
	{
		this.persistenClass = persistenClass;
	}
	
	public HibernateTemplate getHibernateTemplate() 
	{
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) 
	{
		this.hibernateTemplate = hibernateTemplate;
	}

	public E find(ID id) 
	{
		E entity = hibernateTemplate.get(persistenClass, id);
		return entity;
	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() 
	{
		 return  hibernateTemplate.find("from " + getPersistenClass().getSimpleName());
	}

	public E save(E entity) 
	{
		hibernateTemplate.saveOrUpdate(entity);
		hibernateTemplate.flush();
		return entity;
	}

	public void delete(E entity) {
		hibernateTemplate.delete(entity);
	}

	public List<E> findByExample(E exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
