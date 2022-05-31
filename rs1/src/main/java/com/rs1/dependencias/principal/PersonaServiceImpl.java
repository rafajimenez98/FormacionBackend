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

    private static int count = 1;
    List<Persona> personas = new ArrayList<>();

    public PersonaServiceImpl() {
        Persona p1 = new Persona(count++,"bean1",  21,"Jaen");
        Persona p2 = new Persona(count++,"bean2",  21,"Jaen");
        Persona p3 = new Persona(count++,"bean3",  21,"Jaen");

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
    }
    public Persona crearPersona(
            String nombre, Integer edad, String poblacion) {
        Persona p = new Persona(count++, nombre, edad, poblacion);
        personas.add(p);
        return p;
    }

    @Override
    public Persona borrarPersona(Integer id) {
        Persona persona = new Persona();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).id.equals(id))
                persona=personas.get(i);

        }
        personas.remove(persona);
        return persona;
    }



    public Persona modificarPersona(Integer id, String nombre, Integer edad, String poblacion) {
        Persona persona = new Persona();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).id.equals(id)){
                personas.get(i).setNombre(nombre);
                personas.get(i).setEdad(edad);
                personas.get(i).setPoblacion(poblacion);
                System.out.println(personas);
                return personas.get(i);
            }
        }
        return null;
    }


    public Persona consultarPersonaID(Integer id){
        Persona persona = new Persona();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).id.equals(id))
                persona=personas.get(i);

        }
        return persona;
    }

    public Persona consultarPersonaNombre(String nombre){
        Persona persona = new Persona();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).nombre.equals(nombre))
                persona=personas.get(i);

        }
        return persona;
    }
}


