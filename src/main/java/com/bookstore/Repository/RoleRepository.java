package com.bookstore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.Entity.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
