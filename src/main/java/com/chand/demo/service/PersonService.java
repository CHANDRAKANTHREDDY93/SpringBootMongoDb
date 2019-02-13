package com.chand.demo.service;

import java.io.IOException;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chand.demo.data.Person;
import com.chand.demo.repository.PersonRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	
	public Flux<Person> getAllPersons(){
		return personRepo.findAll();
	}
	
	public Mono<Person> getPersonById(String id){
		return personRepo.findById(id);
	}
	
//	private Mono<PersonSchema> getPersonById(String id){
//		return personRepo.findById(id).map(this::map);
//	}
	
//	private PersonSchema map(Person person) {
//		return PersonSchema.builder()
//				.id(person.getId())
//				.firstName(person.getFirstName())
//				.lastName(person.getLastName())
//				.build();
//	}
	
	public Mono<Person> savePerson(@NotNull Person person) throws IOException{
		return personRepo.save(person);
	}
	
//	public PersonSchema createPerson(@NotNull Person person) throws IOException{ 
//		PersonSchema personSchema = new PersonSchema();
//		personSchema.setId(person.getId());
//		personSchema.setFirstName(person.getFirstName());
//		personSchema.setLastName(person.getLastName());
//		personSchema.setName(person.getName());
//		personSchema.setAge(person.getAge());
//		personSchema.setQualification(person.getQualification());
//		personSchema.setDesignation(person.getDesignation());
//		//personSchema.setInterests(person.getInterests());
//		return personSchema;
//	}
	
	
	public Mono<Void> deleteOne(String id){
		Person person = new Person();
		person.setId(id);
		return personRepo.deleteById(id);
	}
	
	
	
}
