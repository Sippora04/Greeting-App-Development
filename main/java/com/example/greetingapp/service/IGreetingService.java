package com.example.greetingapp.service;

import com.example.greetingapp.configure.GreetingConfigure;
import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;

public interface IGreetingService {

	String getMessage();

	String getMessage(User user);

	Greeting saveGreeting(GreetingConfigure greetingconfig);

}