package com.in28minutes.rest.webservices.restfulwebservices.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

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
	
	
}
