package com.daniel.belmonte.ClientRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRestApplication.class, args);
//		getActors();
		getActor(1);
	}

	@Bean
	public static RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	public static void getActors() {
		final String uri = "http://localhost:8080/api/actors";
		RestTemplate restTemplate = getRestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		
		System.out.println(result);
	}
	
	public static void getActor(int id) {
		final String uri = "http://localhost:8080/api/actors/" + id;
		RestTemplate restTemplate = getRestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		
		System.out.println(result);
	}
	
	//postForObject para pasar una petición POST y devolver un JSON
}
