package com.example.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingapp.model.User;
import com.example.greetingapp.service.IGreetingService;

/*
 * @RestController annotation indicates that a particular class
 * serves the role of a controller which can handle REST API calls.
 * 
 * @RequestMapping annotation is used for URL Mappings.
 * 
 * @Autowired annotation can be used to autowire bean on the setter method
 * @Autowired annotation in spring automatically injects the dependent beans into the associated references of a POJO class. 
 * This annotation will inject the dependent beans by matching the data-type 
*/
@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Autowired
	private IGreetingService greetingService;

	@RequestMapping("/get")
	public String greetingMessage() {
		return greetingService.getMessage();
	}

	@PostMapping("/post")
	public String greetUser(@RequestBody User user) {
		return greetingService.getMessage(user);
	}
}
