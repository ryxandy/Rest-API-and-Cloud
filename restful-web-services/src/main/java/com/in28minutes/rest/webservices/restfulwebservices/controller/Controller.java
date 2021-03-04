package com.in28minutes.rest.webservices.restfulwebservices.controller;


import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private MessageSource messageSource;
	
	
	//Returning a string
	@GetMapping(path = "/hello")
	public String helloWorld() {
		System.out.println("Entrou aqui! ");
		return "Hello World";
	}
	
	//Returning a bean that will be converted to json
	@GetMapping(path = "/hello-bean")
	public Bean helloWorldBean() {
		System.out.println("Convertendo Bean para JSON");
		return new  Bean("Olá estou testando conversão de Bean para JSON");
	}
	
	//Returning a bean that will be converted to json
		@GetMapping(path = "/hello-world/path-variable/{name}")
		public Bean helloWorldPathVariable(@PathVariable String name) {
			System.out.println("Estou usando Path Variable");
			return new  Bean(String.format("Hello world, %s", name));
		}
	
	@GetMapping(path = "/hello-world-internationalized")	
	public String HelloWorldInternationalized(@RequestHeader(name = "Accepted-Language", required = false ) Locale locale) {
		return messageSource.getMessage("good.morning.message", null, locale);
	}
	
}
