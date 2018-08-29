package com.example.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bean.Person;
import com.example.dao.UserRepository;


@Service
public class PersonService {
	private final Logger logger = LoggerFactory.getLogger(PersonService.class);

	@Autowired
	private UserRepository userRepository;
	
	public List<Person> welcome(){
		logger.info("info-----");
		logger.debug("debug-----");
		logger.error("error-----");
		logger.warn("warn-----");
		return (List<Person>) userRepository.findAll();
	}
	@Transactional
	public void savePerson(Person person){
		userRepository.save(person);
		//int i=1/0;
	}
	
	public Optional<Person> findById(Long id){
		return userRepository.findById(id);
	}
}
