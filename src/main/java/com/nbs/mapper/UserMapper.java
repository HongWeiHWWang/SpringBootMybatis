package com.nbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nbs.pojo.User;

@Mapper
public interface UserMapper {
	
	public List<User> findAll();

}
