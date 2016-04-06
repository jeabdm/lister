package com.lister.dal.impl;

import java.util.List;
import org.hibernate.Session;
import com.lister.dal.interfaces.Idao;
import com.lister.entities.User;

public class DaoUser extends DaoBase implements Idao<User>{

	@Override
	public long insert(User e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long update(User e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(User e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User get(Long id) {
		Session s = this.sessionFactory.openSession();
		User u = (User)s.get(User.class, id);
		s.close();
		return u;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User getByUsername(String userName){
		return null;
	}

}
