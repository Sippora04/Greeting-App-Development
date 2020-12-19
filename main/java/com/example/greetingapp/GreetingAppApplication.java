package com.example.greetingapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {
	public static final Logger logger = LoggerFactory.getLogger(GreetingAppApplication.class);

	public static void main(String[] args) {

		logger.debug(" “Welcome to Greeting App” ");
		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
