package com.chand.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = "com.chand.demo")
@EnableWebFlux
@EnableReactiveMongoRepositories
@Slf4j
public class SpringMongoDbStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbStarterApplication.class, args);
	}
}
