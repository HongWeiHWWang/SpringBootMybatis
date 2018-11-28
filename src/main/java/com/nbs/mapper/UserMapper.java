package com.nbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nbs.pojo.User;

@Mapper
public interface UserMapper {
	
	public List<User> findAll();
	
	void insertUser(User user);
	
	User selectUserById(Integer id);
	
	void updateUser(User user);
	
	void deleteUserById(Integer id);

}
