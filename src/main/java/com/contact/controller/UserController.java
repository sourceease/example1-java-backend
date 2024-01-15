package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.User;
import com.contact.service.ContactService;
import com.contact.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	    @Autowired
        private UserService userService;

	    @GetMapping
	    public List<User> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("/{userId}")
	    public User getUserById(@PathVariable Integer UserId) {
	        return userService.getUserById(UserId);
	    }

	    @PostMapping()
	    public User saveUser(@RequestBody User user) {
	        return userService.saveUser(user);
	    }

	    @PutMapping("/{userId}")
	    public Integer updateUserById(@PathVariable Integer userId, @RequestBody User user) {
	        return userService.updateUserById(userId, user);
	    }
	    
	    @DeleteMapping("/{userId}")
	    public void deleteUser(@PathVariable Integer UserId) {
	    	userService.deleteUser(UserId);
	    
	}
}
