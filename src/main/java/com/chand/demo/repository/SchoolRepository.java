package com.chand.demo.repository;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.chand.demo.data.Schooling;

import reactor.core.publisher.Mono;

@Repository
public interface SchoolRepository extends ReactiveMongoRepository<Schooling, String> {
	public Mono<Schooling> save(@NotNull Schooling request);
}
