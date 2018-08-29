package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Person;
import com.example.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
	
	@RequestMapping("/getUserById")
    @ResponseBody
	public Optional<Person> getUserById(Long id){
		Optional<Person> person = personService.findById(id);
		return person;
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(String name,int age,int sex){
		Person person = new Person();
		person.setAge(age);
		person.setName(name);
		person.setSex(sex);
		personService.savePerson(person);
		return "success";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "Hello World";
	}
	@RequestMapping("/index2")
	public String index2(){
		return "Hello World";
	}
}
