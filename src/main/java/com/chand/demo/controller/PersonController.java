package com.chand.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chand.demo.data.Person;
import com.chand.demo.schema.PersonSchema;
import com.chand.demo.service.PersonService;
import org.springframework.http.MediaType;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
@RestController
//@RequestMapping(path = {Constants.API_BASE_CONTEXT_PATH},produces = {MediaType.APPLICATION_JSON_VALUE})
@RequestMapping(path="/person")
@Slf4j
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@Value("${project.name}")
	private String name;
	@Value("${project.version}")
	private String version;
	
//	@GetMapping(path = {"/version"})
//    public Mono<ResponseEntity<Project>> getVersion(){
//        Project project = Project.builder().name(name).version(version).build();
//        return Mono.just(ResponseEntity.ok().body(project));
//    }
	@GetMapping("/persons")
	public Flux<PersonSchema> getAllData(){
		return personService.getAllPersons();
	}
	
	@PostMapping(path="/persons", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<PersonSchema> postPerson(@RequestBody @NotNull Person person) throws IOException{
		return personService.savePerson(person);
	}
	
	
	
}
