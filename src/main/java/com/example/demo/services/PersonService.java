package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.entities.Person;

public class PersonService {
	private List<Person> persons = new ArrayList<Person>();
	
	public PersonService() {
		persons.add(new Person("test","test",22));
		persons.add(new Person("test1","test1",22));
		persons.add(new Person("test2","test2",22));
	}
	
	public Person getPerson() {
		Random rn = new Random();
		int temp = rn.nextInt(this.persons.size());
		return persons.get(temp);
	}
}
