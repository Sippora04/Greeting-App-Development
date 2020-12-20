package com.example.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.example.greetingapp.configure.GreetingConfigure;

@Entity
public class Greeting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String msg;

	public Greeting() {
	}

	public Greeting(GreetingConfigure greetingconfig) {
		this.msg = greetingconfig.msg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}