package com.example.demo.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entities.Person;

public class DemoClient {

	public static Logger log = (Logger) LoggerFactory.getLogger(RestTemplate.class);
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject("http://localhost:8080/person", Person.class);
		log.info(person.toString());

	}
}
