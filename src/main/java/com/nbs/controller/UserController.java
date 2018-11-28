package com.nbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbs.pojo.User;
import com.nbs.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("ssm")
	public List<User> findAll(){
		List<User> list = userService.findAll();
		return list;
	}

}
