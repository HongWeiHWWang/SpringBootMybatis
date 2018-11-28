package com.nbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nbs.pojo.User;
import com.nbs.service.UserService;

//@RestController
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 页面跳转
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	/**
	 * 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser(User user){
		userService.addUser(user);
		return "ok";
		
	}
	
	/**
	 * 查询全部用户
	 * @return
	 */
	@RequestMapping("/findAll")
	public @ResponseBody List<User> findAll(){
		List<User> list = userService.findAll();
		return list;
	}
	
	/**
	 * 查询全部用户到页面
	 */
	@RequestMapping("/findUserAll")
	public String findUserAll(Model model){
		List<User> list = userService.findAll();
		model.addAttribute("list", list);
		return "showUsers";
	}
	
	/**
	 * 根据用户id查询用户
	 */
	@RequestMapping("/findUserById")
	public String findUserById(Integer id, Model model){
		User user = userService.findUserById(id);
		model.addAttribute("user", user);
		return "updateUser";
	}
	
	/**
	 * 更新用户
	 */
	@RequestMapping("/editUser")
	public String editUser(User user){
		userService.updateUser(user);
		return "ok";
	}
	
	/**
	 * 删除用户
	 */
	@RequestMapping("/delUser")
	public String delUser(Integer id){
		userService.deleteUserById(id);
		return "redirect:/user/findUserAll";
	}

}
