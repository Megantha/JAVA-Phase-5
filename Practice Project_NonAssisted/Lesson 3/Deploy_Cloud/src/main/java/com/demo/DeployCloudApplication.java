package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class DeployCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployCloudApplication.class, args);
	}

}
