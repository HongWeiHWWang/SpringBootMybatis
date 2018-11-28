package com.nbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nbs.mapper.UserMapper;
import com.nbs.pojo.User;
import com.nbs.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}

}
