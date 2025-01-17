package com.desafio.cepapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.desafio.cepapp")
public class DesafioCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioCepApplication.class, args);
	}

}
