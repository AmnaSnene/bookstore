package com.bookstore.Service;

import java.util.Set;

import com.bookstore.Entity.User;
import com.bookstore.Entity.security.PasswordResetToken;
import com.bookstore.Entity.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
}
