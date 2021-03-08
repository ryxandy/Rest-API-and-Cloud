package com.in28minutes.rest.webservices.restfulwebservices.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Pokemons {

	private String nome;
	private String tipo;
	

	@JsonIgnore
	private String regiao;
	
	
	public Pokemons(String nome, String tipo, String regiao) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.regiao = regiao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getRegiao() {
		return regiao;
	}


	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	
}
