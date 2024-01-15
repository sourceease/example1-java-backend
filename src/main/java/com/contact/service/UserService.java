package com.contact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.model.User;

@Service
public class UserService {

	private List<User> users = new ArrayList<>();
	private Integer nextId = 0;

	public List<User> getAllUsers() {
		return users;
	}

	public User getUserById(Integer userId) {
		return users.get(userId);
	}

	public User saveUser(User user) {
		if (user.getUserId() == null) {
			user.setUserId(nextId++);
		}
		users.add(user);
		return user;
	}

	public Integer updateUserById(Integer userId, User user) {
		// Integer index = id-1;
		users.set(userId, user);
		return userId;
	}

	public void deleteUser(Integer userId) {
		users.remove(userId);
	}
}