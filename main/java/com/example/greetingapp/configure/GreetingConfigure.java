package com.example.greetingapp.configure;

import javax.validation.constraints.NotEmpty;

public class GreetingConfigure {
	@NotEmpty(message = "Name should not be empty")
	public String msg;
}
