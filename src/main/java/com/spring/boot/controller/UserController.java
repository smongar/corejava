package com.spring.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.models.User;
import com.spring.boot.repository.UserDao;

@RestController
@RequestMapping("/userapi")
public class UserController {
	
	@Autowired
	private UserDao udao;
	
	@PostMapping(value="/user")
	public User saveUser(@Valid @RequestBody User user){
		return udao.createUser(user);
	}
	
	@GetMapping(value="/getuser")
	public List<User> getUser(User u){
		
		return udao.getAll();
	}

}
