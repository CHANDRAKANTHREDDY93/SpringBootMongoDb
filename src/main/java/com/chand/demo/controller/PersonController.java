package com.chand.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chand.demo.data.Person;
import com.chand.demo.repository.NewPersonRepo;
import com.chand.demo.repository.PersonRepository;
import com.chand.demo.service.PersonService;
import com.chand.demo.service.ProductService;

import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

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
	
	//@Autowired PersonRepository personRepo;
	
	ProductService personRepo;
	
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
	public Flux<Person> getAllData(){
		return personService.getAllPersons();
	}
	
	@GetMapping(path="", produces= {MediaType.APPLICATION_JSON_VALUE})
	public Mono<Person> getPersonById(@PathVariable("id")  final String id){
		return personService.getPersonById(id);
	}
	
	
	@PostMapping(path="/persons", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Person> postPerson(@RequestBody @NotNull Person person) throws IOException{
		return personService.savePerson(person);
	}
	
	
//	 @ApiOperation(value = "Add a person")
//	  @RequestMapping(value = "/person", method = RequestMethod.POST, produces = "application/json")
//	public ResponseEntity<Person> savePerson(@RequestBody Person person) {
//		//personService.createPerson(person);
//		personRepo.save(person);
//		return new ResponseEntity("Successfully saved", HttpStatus.OK);
//	}
//	
	@DeleteMapping(path="/{id}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Mono<Void> deletePerson(@RequestBody @NotNull String id) throws IOException{
		return personService.deleteOne(id);
	}
	
	
	
	
}
