package com.techm.ms.userservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.techm.ms.model.Account;
import com.techm.ms.model.User;
import com.techm.ms.service.AccountService;

public class UserServiceImpl implements UserService {

private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static {
		users= populateDummyUsers();
	}
	
	@Override
	public User createUser(long id) {
		
		return null;
	}

	@Override
	public User findByName(String name) {
		
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void saveUser(User usr) {
		counter.incrementAndGet();
		users.add(usr);
	}

	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		return users;
	}

}
