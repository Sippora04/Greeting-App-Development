package com.example.greetingapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.IGreetingService;

/*@RequestParam for accessing HTTP
* request query parameters. 
*/
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	/* @Autowired
	 * This annotation is applied to fields, setter methods, and constructors.
	 * The @Autowired annotation injects object dependency implicitly.
	 */
	
	@Autowired
	private IGreetingService greetingService;

	@GetMapping("/get/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
