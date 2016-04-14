package com.lister.bll.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.lister.dal.impl.DaoUser;
import com.lister.entities.User;

@Service("userService")
public class UserService extends GenericService<User, Long> implements UserDetailsService{
	
	@Autowired
	private DaoUser daoUser;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = daoUser.getByUsername(userName);
		if(user == null){
			throw new UsernameNotFoundException("User not fund");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), 
																	   user.getPassword(), null);

	}
	
	
		
}
