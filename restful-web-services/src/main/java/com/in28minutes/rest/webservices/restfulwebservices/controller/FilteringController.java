package com.in28minutes.rest.webservices.restfulwebservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
//This controller and methods was made to test the concecpt of filtering some fields of a json response
	
	
	@GetMapping(path = "/pokemon")
	public Pokemons returnPokemons() {
		return new Pokemons("Charizard", "Fire", "Kanto");
	}

	@GetMapping(path = "/pokemon-list")
	public List<Pokemons> retornarListOfPokemons() {
		return Arrays.asList(new Pokemons("Charizard", "Fire", "Kanto"), new Pokemons("Blastoise", "Water", "Kanto")) ;
	}



}
