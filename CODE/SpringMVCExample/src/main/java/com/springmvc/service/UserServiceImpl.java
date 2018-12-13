package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.UserDao;
import com.springmvc.model.Login;
import com.springmvc.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDaoService;
	@Override
	public void register(User user) {
		userDaoService.register(user);
		
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
