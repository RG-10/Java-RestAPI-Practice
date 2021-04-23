package com.uog.java.spring.schedular.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uog.java.spring.schedular.api.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	

}
