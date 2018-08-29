package com.example.dao;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Person;

@Repository
@Table(name="user")
public interface UserRepository extends CrudRepository<Person, Long > {

}