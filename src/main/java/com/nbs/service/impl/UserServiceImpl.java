package com.nbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbs.mapper.UserMapper;
import com.nbs.pojo.User;
import com.nbs.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}

	@Override
	public void addUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public User findUserById(Integer id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void deleteUserById(Integer id) {
		userMapper.deleteUserById(id);
	}

}
