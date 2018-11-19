package com.chand.demo.service;

import java.io.IOException;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chand.demo.data.Person;
import com.chand.demo.repository.PersonRepository;
import com.chand.demo.schema.PersonSchema;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	
	public Flux<PersonSchema> getAllPersons(){
		return personRepo.findAll();
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
	
	public Mono<PersonSchema> savePerson(@NotNull Person person) throws IOException{
		PersonSchema personSchema = createPerson(person);
		return personRepo.save(person);
	}
	public PersonSchema createPerson(@NotNull Person person) throws IOException{ 
		PersonSchema personSchema = new PersonSchema();
		personSchema.setId(person.getId());
		personSchema.setFirstName(person.getFirstName());
		personSchema.setLastName(person.getLastName());
		return personSchema;
	}
	
}
