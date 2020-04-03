package com.noteit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noteit.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
