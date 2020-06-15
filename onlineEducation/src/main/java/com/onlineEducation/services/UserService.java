package com.onlineEducation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineEducation.models.User;
import com.onlineEducation.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	public User getStudent(int id) {
		Optional<User> result = userRepository.findById(id);
		return result.get();
	}

//	public void addUser(User user) {
//		userRepository.save(user);
//		
//	}

	public void updateUser(int id, User user) {
		userRepository.save(user);

	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
