package com.example.greetingapp.service;

import com.example.greetingapp.model.User;

public interface IGreetingService {

	String getMessage();

	String getMessage(User user);

}