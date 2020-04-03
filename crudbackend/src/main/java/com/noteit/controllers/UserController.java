package com.noteit.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noteit.entities.User;
import com.noteit.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepo.findById(id);
	}
	
	@DeleteMapping("/cancel/{id}")
	public List<User> deleteUser(@PathVariable Long id) {
		userRepo.deleteById(id);
		return userRepo.findAll();
	}
	
	@PostMapping("/register")
	public String createUser(@RequestBody User user) {
		userRepo.save(user);
		return "Hi " + user.getFname() + " your Registration process successfully completed";
	}
	

	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepo.save(user);
	}

	
}
