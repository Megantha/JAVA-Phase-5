package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/")
	public String welcomeMsg() {
		return "Welcome Spring Boot Application on AWS Cloud";
	}

}
