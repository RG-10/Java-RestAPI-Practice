package com.uog.java.spring.schedular.api.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.uog.java.spring.schedular.api.dao.UserDao;
import com.uog.java.spring.schedular.api.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
    Logger log = LoggerFactory.getLogger(UserService.class);
	
	//Method to Schedule a job to add object in Database(Every 5 seconds)
	@Scheduled(fixedRate = 5000)
	public void add2DBJob() { 
		
		User user = new User();
		user.setName("user" +new Random().nextInt(37443));
		dao.save(user);
		System.out.println("add service call in" +new Date().toString());
		
		
		
		
	}
	@Scheduled(cron = "0/5 * * * * *")
	public void fetchDB() {
		List <User> users = dao.findAll();
		System.out.println("fetch service call in" +new Date().toString());
		System.out.println("No. of record fetched :" +users.size());
		log.info("users :  {}", users);
		
	}
	
	

}
