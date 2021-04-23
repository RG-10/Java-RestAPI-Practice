package com.uog.java.spring.schedular.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedular1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedular1Application.class, args);
	}

}
