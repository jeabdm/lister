package com.lister.dal.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.lister.entities.User;

public class DaoUser extends GenericDao<User, Long>{

	public DaoUser(){		
	
	}
	
	public User getByUsername(String name){
		Session s = null;
		User user = null;
		try {
			s = this.sessionFactory.openSession();
			Query q = s.createQuery("FROM User u WHERE u.username =: UN");
			q.setParameter("UN", name);
			user = (User)q.uniqueResult();
		} catch (HibernateException ex) {
			// TODO: handle exception
		}finally{
			this.closeSession(s);
		}
		return user;
		
	}
	
}
