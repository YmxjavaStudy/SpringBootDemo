package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bean.Person;
import com.example.service.PersonService;

@Controller
public class Welcome {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/welcome")
	public String welcome(Model model){
		List<Person> person = personService.welcome();
		model.addAttribute("people", person);
		return "welcome";
	} 
}
