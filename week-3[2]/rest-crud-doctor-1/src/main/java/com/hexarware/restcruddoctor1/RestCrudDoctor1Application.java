package com.hexarware.restcruddoctor1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestCrudDoctor1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestCrudDoctor1Application.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
	
	
	

}
