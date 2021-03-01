package com.in28minutes.rest.webservices.restfulwebservices.controller;

public class Bean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Bean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloWorldBean [message=" + message + "]";
	}
	
	
}
