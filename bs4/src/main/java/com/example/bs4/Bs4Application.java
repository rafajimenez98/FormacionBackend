package com.example.bs4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Bs4Application {
	@Autowired
	private SimpleProperties simpleProperties;


	public static void main(String[] args) {

		SpringApplication.run(Bs4Application.class, args);
	}

	@PostConstruct
	private void postInit(){
		System.out.println("Simple properties info...");
		System.out.println(simpleProperties);
	}

}
