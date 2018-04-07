package com.techm.ms.userservice;

import java.util.List;

import com.techm.ms.model.User;

public interface UserService {
		
		User createUser(long id);
		
		User findByName(String name);

		List<User> findAllUsers();
		
	
}
