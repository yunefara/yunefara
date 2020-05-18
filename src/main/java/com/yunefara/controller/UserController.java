package com.yunefara.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yunefara.entities.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public User greeting(@RequestParam(value = "id")Long id) {
		User user = new User();
		user.setFirstName("Hello");
		user.setLastName("World");
		user.setEmail("hello_world@yunefara.com");
		user.setId(id);
		return user;
	}
}
