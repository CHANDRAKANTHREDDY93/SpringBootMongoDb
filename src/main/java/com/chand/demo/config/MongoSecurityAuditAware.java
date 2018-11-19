package com.chand.demo.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;


public class MongoSecurityAuditAware implements AuditorAware<String>{
	
	 @Override
	    public Optional<String> getCurrentAuditor() {
	        return Optional.of("Person_Test_User");
	    }

}
