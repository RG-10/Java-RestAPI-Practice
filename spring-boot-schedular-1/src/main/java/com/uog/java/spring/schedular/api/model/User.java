package com.uog.java.spring.schedular.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	
	@Id
	@GeneratedValue
	private Integer id;

	@SuppressWarnings("unused")
	private String name;

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}


}
