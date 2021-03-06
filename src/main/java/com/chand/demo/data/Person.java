package com.chand.demo.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data 
@Document(collection="person")
public class Person {
	
	@Id
	@Generated
	private String id;
	private String firstName;
	private String lastName;
	private String name;
	private int age;
	private String qualification;
	private String designation;
	//private Array interests;
	
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
	//private void setName(String firstName, String lastName) {
		//this.name = firstName + lastName;
	//}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getQualification(){
		return qualification;
	}
	public void setDesignation(String designation) {
		this.designation =designation;
	}
	public String getDesignation() {
		return designation;
	}
	//public void setInterests(Array interests) {
		//this.interests = interests;
	//}
	//public Array getInterests() {
		//return interests;
	//}
	
	public String getName() {
		return firstName + lastName;
	}
	


}
