package com.example.greetingapp.model;

public class Greeting {

	private long id;

	private String msg;

	public Greeting(long id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return msg;
	}

	public void setMessage(String msg) {
		this.msg = msg;
	}
}
