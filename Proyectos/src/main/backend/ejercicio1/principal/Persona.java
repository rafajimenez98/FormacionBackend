package src.main.backend.ejercicio1.principal;


public class Persona {

    // Atributos
    String nombre;
    String poblacion;
    Integer edad;

    public Persona() {
    }
    // Constructor
    public Persona(String nombre, String poblacion, Integer edad) {
        this.nombre = nombre;
        if (poblacion.equals(""))
            this.poblacion = "Desconocido";
        else
            this.poblacion= poblacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
