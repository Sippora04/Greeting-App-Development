package com.example.greetingapp.service;

import java.util.List;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);

	List<Greeting> getAllGreetings();

	String deleteGreeting(long id);

	Greeting updateGreeting(long id, String message);
}