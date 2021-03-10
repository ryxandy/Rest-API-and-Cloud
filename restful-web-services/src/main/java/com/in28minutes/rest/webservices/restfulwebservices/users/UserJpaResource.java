package com.in28minutes.rest.webservices.restfulwebservices.users;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.exception.UserNotFoundExecption;

@RestController
public class UserJpaResource {
	//This class is made to deal with rest calls, where i will create the end points
	@Autowired
	private UserRepository userRepository;
	
	
	//Get all users
	@GetMapping(path = "/jpa/users")
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	//Get one specific user
	@GetMapping(path = "/jpa/users/{id}")
	public Optional<User> findOne(@PathVariable int id) {
		Optional<User>  user = userRepository.findById(id);
		if (!user.isPresent()) {
		throw new UserNotFoundExecption("id- " + id);	
		}
		return userRepository.findById(id);
	}

	
	//Creating a new user
	@PostMapping(path = "/jpa/users")
	public void createUser(@Valid @RequestBody User user) {
		Date dataAtual = new Date();
		System.out.println("A new user was added at " + dataAtual.toString());
		User savedUser = userRepository.save(user);
	}
	
	//Deleting one user
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
		System.out.println("The user was deleted :) ");
	}
}
