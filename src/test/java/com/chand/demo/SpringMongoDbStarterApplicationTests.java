package com.chand.demo;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvcBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import com.chand.demo.data.Person;
import com.chand.demo.repository.PersonRepository;
import com.chand.demo.service.PersonService;

import reactor.core.publisher.Flux;

@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest
public class SpringMongoDbStarterApplicationTests {
	
	MockMvcBuilder mockMvc;
	
	//@MockBean
	//PersonRepository personRepo;
	
	

	@Test
	public void contextLoads() throws Exception {
		//when(personRepo.findAll()).thenReturn((Flux<Person>) Collections.emptyList());
		//MvcResult mvcRes = mockmvc.perform(MockMvcRequestBuilders.get("/person/persons/").accept(MediaType.APPLICATION_JSON)).andReturn();
		//System.out.println(mvcRes.getResponse());
		//verify(personRepo).findAll();
	}

}
