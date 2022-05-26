package com.rs1.dependencias.principal;

import org.springframework.stereotype.Component;

import java.util.List;


public interface PersonaService {

    Persona crearPersona(String nombre, Integer edad, String poblacion);

    List<Persona> getPersonas();
}
