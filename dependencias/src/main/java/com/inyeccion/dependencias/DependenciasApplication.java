package com.inyeccion.dependencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {
		"com.bosonit.backend.ejercicio3.REST",
		"com.bosonit.backend.ejercicio3.servicios"
})
@EntityScan(basePackages = "com.bosonit.backend.ejercicio3.entidades")
public class DependenciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependenciasApplication.class, args);
	}

}
