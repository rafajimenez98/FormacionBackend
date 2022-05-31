package com.rs1.dependencias.principal;


public interface PersonaService {

    Persona crearPersona(String nombre, Integer edad, String poblacion);

    Persona borrarPersona(Integer id);

    Object consultarPersonaID(Integer id);

    Object consultarPersonaNombre(String nombre);

    Persona modificarPersona(Integer id, String nombre, Integer edad, String poblacion);
}
