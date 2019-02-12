package com.chand.demo.schema;


import java.sql.Array;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection="person")
@org.springframework.data.annotation.TypeAlias("person")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonSchema {
	
//	public String getId() {
//		return id;
//	}
//	public void setId(String _i) {
//		this.id = _i;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setQualification(String qualification) {
//		this.qualification = qualification;
//	}
//	public String getQualification(){
//		return qualification;
//	}
//	public void setDesignation(String designation) {
//		this.designation =designation;
//	}
//	public String getDesignation() {
//		return designation;
//	}
	//public void setInterests(Array interests) {
	//	this.interests = interests;
	//}
//	public Array getInterests() {
		//return interests;
	//}
	
	public String getName() {
		return firstName + lastName;
	}
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
	
}
