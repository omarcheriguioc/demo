package com.example.demo.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Person;
import com.example.demo.services.PersonService;

@RestController
public class HelloEndpoint {
	private PersonService personService;
	
	public HelloEndpoint(PersonService personService) {
		// TODO Auto-generated constructor stub
		this.personService = personService;
	}
	@RequestMapping("/")
	public String helloMethod() {
		return "hello world!";
	}
	
	@RequestMapping("/person")
	public Person getPerson() {
		return personService.getPerson();
	}
	
}
