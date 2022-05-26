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

    public PersonaServiceImpl() {
        Persona p1 = new Persona(1,"bean1",  21,"Jaen");
        Persona p2 = new Persona(2,"bean2",  21,"Jaen");
        Persona p3 = new Persona(3,"bean3",  21,"Jaen");

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
    }
    public Persona crearPersona(
            Integer id, String nombre, Integer edad, String poblacion) {
        Persona p = new Persona(id, nombre, edad, poblacion);
        personas.add(p);
        return p;
    }
}


