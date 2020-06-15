package com.onlineEducation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineEducation.repositories.UserRepository;
import com.onlineEducation.services.UserService;
import com.onlineEducation.models.User;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository repository;

	@RequestMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@GetMapping(value = "users/{id}")
	public Optional<User> findBynum(@PathVariable int id) {

		Optional<User> user = repository.findById(id);
		return user;
	}

//	@RequestMapping(method = RequestMethod.POST, value = "/users/create")
//	public void addUser(@RequestBody User user) {
//		userService.addUser(user);
//	}

	@PostMapping(value = "/users/create")
	public User postUser(@RequestBody User user) {

		User users = repository.save(new User(user.getFirstName(), user.getLastName(), user.getUserName(),
				user.getEmail(), user.getMobile(), user.getPassword()));
		return users;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable int id) {
		userService.updateUser(id, user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

}
