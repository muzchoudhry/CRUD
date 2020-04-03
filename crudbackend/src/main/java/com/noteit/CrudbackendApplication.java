package com.noteit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.noteit.entities.User;
import com.noteit.repositories.UserRepository;

@SpringBootApplication
public class CrudbackendApplication /*implements CommandLineRunner*/ {

//	@Autowired
//	private UserRepository userRepo;
//	
	public static void main(String[] args) {
		SpringApplication.run(CrudbackendApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		userRepo.save(new User("one", "one"));
//		userRepo.save(new User("two", "one"));
//		userRepo.save(new User("three", "one"));
//	}

}
