package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	

}
