package com.spring.boot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.models.User;

@Service
public class UserDao{
	
	@Autowired
	private UserRepo userRepo;
	
	public User createUser(User u){
		return userRepo.save(u);
	}
	
	public List<User> getAll(){
		return userRepo.findAll();
	}

	public User getById(int id){
		return userRepo.getOne(id);
	}
	
	public void deleteUserById(Integer id){
		userRepo.deleteById(id);
	}
	
}
