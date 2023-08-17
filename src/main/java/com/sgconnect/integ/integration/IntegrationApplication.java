package com.sgconnect.integ.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.getMapping;

@SpringBootApplication
@RestController
public class IntegrationApplication {
	@getMapping("/Message")
	public String getMessage(){
		return "Hello !!";
	}

	public static void main(String[] args) {

		SpringApplication.run(IntegrationApplication.class, args);
	}

}
