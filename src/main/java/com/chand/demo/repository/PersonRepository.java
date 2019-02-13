package com.chand.demo.repository;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.chand.demo.data.Person;

import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

	public Mono<Person> save(@NotNull Person request);
	public Mono<Person> findById(@NotNull String id);
	public Mono<Void> deleteById(@NotNull String id);
	public Mono<Void> delete(@NotNull Person request);
	

}
