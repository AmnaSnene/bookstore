package com.bookstore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.Entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
