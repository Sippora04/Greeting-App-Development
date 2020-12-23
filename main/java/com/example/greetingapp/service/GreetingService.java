package com.example.greetingapp.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import com.example.greetingapp.repository.IGreetingsRepository;

@Service
public class GreetingService implements IGreetingService {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private IGreetingsRepository greetingRepository;

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? "World" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreetingById(long id) {
		return greetingRepository.findById(id).get();
	}

	@Override
	public List<Greeting> getAllGreetings() {
		return greetingRepository.findAll();
	}

	@Override
	public Greeting updateGreeting(long id, String message) {
		Greeting greet = this.getGreetingById(id);
		greet.setMessage(message);
		greetingRepository.save(greet);
		return this.getGreetingById(id);
	}

	@Override
	public String deleteGreeting(long id) {
		// TODO Auto-generated method stub
		greetingRepository.deleteById(id);
		return "Deleted Successfully";
	}
}