package com.lister.dal.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.lister.dal.interfaces.IGenericDao;

public class GenericDao <T extends Serializable , ID extends Serializable> implements IGenericDao<T, ID>{

	@Autowired
	protected SessionFactory sessionFactory;
	private Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public GenericDao(){
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ID insert(T e){
		Session s = null;
		Transaction tx = null;
		ID id = null;
		try {
			s = this.sessionFactory.openSession();
			tx = s.beginTransaction();
			id = (ID)s.save(e);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			// TODO: handle exception
		}finally{
			this.closeSession(s);
		}
		return id;
	}

	@Override
	public void update(T e){
		Session s = null;
		Transaction tx = null;
		try {
			s = this.sessionFactory.openSession();
			tx = s.beginTransaction();
			s.update(e);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			// TODO: handle exception
		}finally{
			this.closeSession(s);
		}
	}

	@Override
	public void delete(T e){
		Session s = null;
		Transaction tx = null;
		try {
			s = this.sessionFactory.openSession();
			tx = s.beginTransaction();
			s.delete(e);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			// TODO: handle exception
		}finally{
			this.closeSession(s);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(ID id){
		T entity = null;
		Session s = null;
		try {
			s = this.sessionFactory.openSession();
			entity = (T)s.get(this.persistentClass.getName(), id);
		} catch (HibernateException ex) {
			// TODO: handle exception
		}finally{
			this.closeSession(s);
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> get(){
		Session s = null;
		List<T> list = null;
		try {
			s = this.sessionFactory.openSession();
			Query q = s.createQuery("FROM " +this.getPersistentClass().getName());
			list = (List<T>)q.list();
		} catch (HibernateException ex) {
			// TODO: handle exception
		}finally{
			this.closeSession(s);
		}
		return list;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	private void closeSession(Session s){
		if(s != null){
			s.close();
		}
	}
}
