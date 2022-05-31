package com.example.beans;

import com.example.beans.principal.Segunda;
import com.example.beans.principal.Tercera;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class BeansApplication {

	public static String[] valores;
	public static void main(String[] args) {
		valores = args;
		SpringApplication.run(BeansApplication.class, args);
	}
	@PostConstruct
	public void saludo1(){
		System.out.println("Hola desde la clase inicial");
	}

	@Bean
	CommandLineRunner saludo2(){
		return new Segunda();
	}
	@Bean
	CommandLineRunner saludo3(){
		Arrays.asList(valores).forEach(System.out::println);
		return new Tercera();
	}

}