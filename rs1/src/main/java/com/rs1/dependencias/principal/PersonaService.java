package com.rs1.dependencias.principal;

import java.util.List;


public interface PersonaService {

    Persona crearPersona(String nombre, String poblacion, Integer edad);

    List<Persona> getPersonas();
}
