package com.springmvc.service;

import com.springmvc.model.Login;
import com.springmvc.model.User;

public interface UserService {
	void register(User user);
	  User validateUser(Login login);
}
