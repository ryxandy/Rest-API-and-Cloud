package com.in28minutes.rest.webservices.restfulwebservices.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	//This class is made to deal with rest calls, where i will create the end points
	
	@Autowired
	private UserDaoService service;
	
	
	//Get all users
	@GetMapping(path = "/users")
	public List<User> findAll(){
		return service.findAll();
	}
	
	//Get one specific user
	@GetMapping(path = "/users/{id}")
	public User findOne(@PathVariable int id) {
		return service.findOne(id);
	}
}
