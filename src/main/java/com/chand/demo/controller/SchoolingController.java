package com.chand.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chand.demo.data.Schooling;
import com.chand.demo.repository.SchoolRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/school")
public class SchoolingController {
	
	@Autowired
	private SchoolRepository schoolRepository;
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public Flux<Schooling> getAllSchoolsData(){
		return schoolRepository.findAll();
	}
	
	@PostMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public Mono<Schooling> addSchoolData(@RequestBody Schooling request){
		
		return schoolRepository.save(request);
	}
	
	
}
