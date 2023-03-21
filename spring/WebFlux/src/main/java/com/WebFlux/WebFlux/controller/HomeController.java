package com.WebFlux.WebFlux.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
public class HomeController {
	
//	@Autowire
	WebClient wc = WebClient.create();

	@GetMapping("home")
	public ResponseEntity<String> getindex()
	{
		RestTemplate rt = new RestTemplate();
		return rt.getForEntity("http://localhost:8080/home",String.class); 
	}
	
	@GetMapping("reacttrainees")
	public Flux<String> getreact(){
		return wc.get().uri("http://localhost:8080/home").retrieve().bodyToFlux(String.class);
	}	
}