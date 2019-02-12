package com.chand.demo.repository;

import org.springframework.stereotype.Repository;

import com.chand.demo.data.Person;

//@Repository
public interface NewPersonRepo {
	
	Person save(Person person);
}
