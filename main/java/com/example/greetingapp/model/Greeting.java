package com.example.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GREETINGS")
public class Greeting {

	@Id
	private long id;
	private String msg;

	public Greeting() {
		id = 0;
		msg = "";
	}

	public Greeting(long id, String message) {
		this.id = id;
		this.msg = message;
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

	public void setMessage(String message) {
		this.msg = message;
	}
}