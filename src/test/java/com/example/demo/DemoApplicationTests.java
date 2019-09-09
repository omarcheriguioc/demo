package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Person;
import com.example.demo.services.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private PersonService personService;
	private Person person;
	@Before
	public void before() {
		 personService = new PersonService();
		 person = new Person("john", "doe" , 25);
	}
	
	@Test
	public void contextLoads() {
		boolean result = personService.addPerson(person);
		//success test case
		assertEquals(true, result);
	}

}
