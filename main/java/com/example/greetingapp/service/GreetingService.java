package com.example.greetingapp.service;

import org.springframework.stereotype.Service;

import com.example.greetingapp.model.User;

@Service
public class GreetingService implements IGreetingService {
	@Override
	public String getMessage() {
		return "Hello World!!";
	}

	@Override
	public String getMessage(User user) {
		if (user == null) {
			return "Hello World";
		} else if (user.getFirstName() == null) {
			user.setFirstName("");
			return "Hello " + user.getLastName();
		} else if (user.getLastName() == null) {
			user.setLastName("");
			return "Hello " + user.getFirstName();
		} else {
			return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
		}
	}

}