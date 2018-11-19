package com.chand.demo.data;

import org.springframework.data.annotation.Id;

import lombok.*;

@Builder
@Data 
public class Person {
	
	@Id
	@Generated
	private String id;
	private String firstName;
	private String lastName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Person(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
