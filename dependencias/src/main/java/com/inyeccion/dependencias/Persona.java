package com.inyeccion.dependencias;

import lombok.Data;

@Data
public class Persona implements PersonaService{
        String nombre;
        String poblacion;
        int edad;
}

