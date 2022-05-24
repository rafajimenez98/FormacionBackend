package src.main.backend.ejercicio1_1.principal;

import java.util.Optional;

public class Persona {

    // Atributos
    String nombre;
    String poblacion;
    Optional<Integer> edad;

    public Persona() {
    }
    // Constructor
    public Persona(String nombre, String poblacion, Optional<Integer> edad) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPoblacion() { return poblacion; }

    public void setPoblacion(String poblacion) { this.poblacion = poblacion; }

    public Optional<Integer> getEdad() { return edad;
    }

    public void setEdad(Optional<Integer> edad) { this.edad = edad; }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + '.' +
                "Población: " + poblacion + '.' +
                "Edad: " + edad;
    }
}
