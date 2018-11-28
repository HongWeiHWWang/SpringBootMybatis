package com.nbs.service;

import java.util.List;

import com.nbs.pojo.User;

public interface UserService {
	
	public List<User> findAll();
	
	void addUser(User user);
	
	User findUserById(Integer id);
	
	void updateUser(User user);
	
	void deleteUserById(Integer id);
}
