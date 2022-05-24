package com.inyeccion.dependencias;


import com.inyeccion.dependencias.Persona;

import java.util.List;

public interface PersonaService {
    Persona crearPersona(String nombre, String poblacion, Integer edad);

    void addCiudad(Ciudad ciudad);

    List<Persona> getPersonas();

    List<Ciudad> getCiudades();
}
