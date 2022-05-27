package com.rs1.dependencias.principal;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class Persona {
    Integer id;
    String nombre;
    Integer edad;
    String poblacion;

    public Persona() {

    }

    public Persona(Integer id, String nombre, Integer edad, String poblacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.poblacion = poblacion;
    }
}
