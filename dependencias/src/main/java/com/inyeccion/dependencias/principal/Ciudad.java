package com.inyeccion.dependencias.principal;

import lombok.Data;

@Data
public class Ciudad {
    private String nombre;
    private long numHabitantes;

    public Ciudad(String nombre, long numHabitantes) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
    }
}