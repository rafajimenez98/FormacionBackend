package com.inyeccion.dependencias.principal;

import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@Validated
@Getter
public class PersonaServiceImpl implements PersonaService{

    List<Ciudad> ciudades = new ArrayList<>();
    List<Persona> personas = new ArrayList<>();

    public PersonaServiceImpl() {
        Persona p1 = new Persona("bean1", "Jaen", 21);
        Persona p2 = new Persona("bean2", "Jaen", 21);
        Persona p3 = new Persona("bean3", "Jaen", 21);

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
    }

    public Persona crearPersona(
            String nombre, String poblacion, Integer edad) {
        Persona p = new Persona(nombre, poblacion, edad);
        personas.add(p);
        return p;
    }

    public void addCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }
}
