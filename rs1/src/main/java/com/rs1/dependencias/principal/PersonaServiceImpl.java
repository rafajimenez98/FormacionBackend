package com.rs1.dependencias.principal;

import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@Validated
@Getter
public class PersonaServiceImpl implements PersonaService {

    List<Persona> personas = new ArrayList<>();


    public Persona crearPersona(
            String nombre, Integer edad, String poblacion) {
        Persona p = new Persona(nombre, edad, poblacion);
        personas.add(p);
        return p;
    }
}


