package com.springmvc.dao;

import com.springmvc.model.Login;
import com.springmvc.model.User;

public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}
