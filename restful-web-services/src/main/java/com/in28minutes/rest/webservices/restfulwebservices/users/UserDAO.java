package com.in28minutes.rest.webservices.restfulwebservices.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 8;
	
	static {
		users.add(new User(1,"Alexandre", new Date()));
		users.add(new User(2,"Mingau", new Date()));
		users.add(new User(3,"Karine", new Date()));
		users.add(new User(4,"Nahalia", new Date()));
		users.add(new User(5,"Nalva", new Date()));
		users.add(new User(6,"Dragonite", new Date()));
		users.add(new User(7,"Charizard", new Date()));
		users.add(new User(8,"Venossaur", new Date()));
	}
	
	//Find All
	public List<User> findAll(){
		return users;	
	}
	//Add a new user
	public User save(User user) {
	if(user.getId()==null) {
		user.setId(usersCount++);
	}
		users.add(user);
	return user;
	}
	
	//Find One User
	public User findOne(int id) {
		for(User user:users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

}
