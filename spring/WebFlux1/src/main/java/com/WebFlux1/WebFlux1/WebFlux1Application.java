package com.WebFlux1.WebFlux1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebFlux1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebFlux1Application.class, args);
	}

}
