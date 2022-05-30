package com.rs1.dependencias.principal;


public interface PersonaService {

    Persona crearPersona(String nombre, Integer edad, String poblacion);

    Persona borrarPersona(Integer id);

    Persona modificarPersona(String nombre, Integer edad, String poblacion);

    Object consultarPersonaID(Integer id);

    Object consultarPersonaNombre(String nombre);

    Object modificarPersona(Integer id);
}
