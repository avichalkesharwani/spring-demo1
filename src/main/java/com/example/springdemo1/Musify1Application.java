package com.example.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class Musify1Application {

	public static void main(String[] args) {
		SpringApplication.run(Musify1Application.class, args);
	}

}

