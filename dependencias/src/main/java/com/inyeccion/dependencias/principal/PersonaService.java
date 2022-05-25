package com.inyeccion.dependencias.principal;


import java.util.List;

public interface PersonaService {
    Persona crearPersona(String nombre, String poblacion, Integer edad);

    void addCiudad(Ciudad ciudad);

    List<Persona> getPersonas();

    List<Ciudad> getCiudades();
}
