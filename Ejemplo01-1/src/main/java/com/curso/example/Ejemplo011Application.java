package com.curso.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.curso.controller"})
public class Ejemplo011Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo011Application.class, args);
	}

}
