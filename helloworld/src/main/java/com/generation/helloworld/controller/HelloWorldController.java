package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
		
	@GetMapping ("/bsm")
	public String bsm() {
		return "Mentalidade de Crescimento, Persistencia, Responsabilidade Pessoal, Orientação ao Futuro, Comunicação, Orientação ao Detalhe, Proatividade, Trabalho em Equipe";
	}
	
	@GetMapping("/objetivos")
	public String objetivo() {
		return "Comunicação e Gestão de Tempo";
	}
	
}
