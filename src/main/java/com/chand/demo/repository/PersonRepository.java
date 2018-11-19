package com.chand.demo.repository;

import javax.validation.constraints.NotNull;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.chand.demo.data.Person;
import com.chand.demo.schema.PersonSchema;

import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveCrudRepository<PersonSchema, Integer> {

	public Mono<PersonSchema> save(@NotNull Person request);
	public Mono<Person> findById(@NotNull String id);
	
}
