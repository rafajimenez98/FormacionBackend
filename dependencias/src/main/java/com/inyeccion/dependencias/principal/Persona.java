package com.inyeccion.dependencias.principal;

import lombok.Data;

@Data
public class Persona {
        String nombre;
        String poblacion;
        Integer edad;

        public Persona() {
        }

        public Persona(String nombre, String poblacion, Integer edad) {
                this.nombre = nombre;
                this.poblacion = poblacion;
                this.edad = edad;
        }
}

