package com.lister.bll;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.lister.bll.interfaces.Iservice;
import com.lister.dal.impl.DaoUser;
import com.lister.entities.User;

@Service("userService")
public class UserService implements UserDetailsService, Iservice<User>{
	
	@Autowired
	private DaoUser daoUser;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = daoUser.getByUsername(userName);
		if(user == null){
			throw new UsernameNotFoundException("User not fund");
		}
		
		return new org.springframework.security.core.userdetails.User(null, null, null); 
	}

	@Override
	public long save(User e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(User e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long update(User e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
