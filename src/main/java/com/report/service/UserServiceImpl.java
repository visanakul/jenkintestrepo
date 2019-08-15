package com.report.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.report.pojo.User;

@Service
public class UserServiceImpl implements IUserService{

	@Override
	public List<User> getAllUsers() {
		List<User> users=new ArrayList<User>();
		users.add(new User("user1", "user1@gmail.com", "9812345678"));
		users.add(new User("user2", "user2@gmail.com", "9812345679"));
		users.add(new User("user3", "user3@gmail.com", "9812345677"));
		users.add(new User("user4", "user4@gmail.com", "9812345671"));
		users.add(new User("user5", "user5@gmail.com", "9812345672"));
		users.add(new User("user6", "user6@gmail.com", "9812345673"));
		users.add(new User("user7", "user7@gmail.com", "9812345674"));
		users.add(new User("user8", "user8@gmail.com", "9812345675"));
		users.add(new User("user9", "user9@gmail.com", "9812345676"));
		return users;
	}

}
