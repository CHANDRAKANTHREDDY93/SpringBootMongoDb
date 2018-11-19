package com.chand.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

@Configuration
public class MongoConfig extends AbstractReactiveMongoConfiguration{

	@Value("${spring.data.mongodb.uri}")
	private String mongoUri;
	
	@Value("${spring.data.mongodb.database}")
	private String databaseName;
	
	@Override
	public MongoClient reactiveMongoClient() {
		return MongoClients.create(mongoUri);
	}
	
	@Bean
	public ReactiveMongoTemplate reactiveMongoTemplate() {
		return new ReactiveMongoTemplate(reactiveMongoClient(), getDatabaseName());
	}
	
	@Bean
	public AuditorAware<String> mongoSecurityAuditAware(){
		return new MongoSecurityAuditAware();
	}

	@Override
	public String getDatabaseName() {
		return databaseName;
	}
}
