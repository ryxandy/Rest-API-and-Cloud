package com.in28minutes.rest.webservices.restfulwebservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
//This controller and methods was made to test the concecpt of filtering some fields of a json response
	
	
	//Only shows name and type
	@GetMapping(path = "/filtering")
	public MappingJacksonValue returnPokemons() {
		Pokemons pokemon  = new Pokemons("Charizard", "Fire", "Kanto");
			//Variables
			SimpleBeanPropertyFilter  filter = SimpleBeanPropertyFilter.filterOutAllExcept("nome","tipo") ;
			FilterProvider filters = new SimpleFilterProvider().addFilter("pokemonFilter", filter);
			//Configuring the filter
			MappingJacksonValue mapping = new MappingJacksonValue(pokemon);
			mapping.setFilters(filters);
		
		
		return mapping;
	}

	
	//Only Shows Name and region
	@GetMapping(path = "/filtering-list")
	public MappingJacksonValue retornarListOfPokemons() {
		List<Pokemons> list = Arrays.asList(new Pokemons("Charizard", "Fire", "Kanto"), new Pokemons("Blastoise", "Water", "Kanto"));
		//Variables
			SimpleBeanPropertyFilter  filter = SimpleBeanPropertyFilter.filterOutAllExcept("nome","regiao") ;
			FilterProvider filters = new SimpleFilterProvider().addFilter("pokemonFilter", filter);
			//Configuring the filter
			MappingJacksonValue mapping = new MappingJacksonValue(list);
			mapping.setFilters(filters);
		
		return mapping;
	}



}
