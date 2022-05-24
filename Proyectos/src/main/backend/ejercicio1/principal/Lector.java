package src.main.backend.ejercicio1.principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lector {
    private final String ruta;

    public Lector(String ruta) {
        this.ruta = ruta;
    }

    public List<Persona> lectura() {

        Lector lector = new Lector("datos.txt");
        List<Persona> personas = new ArrayList<>();

        String[] lectura;
        String linea;
        FileReader f;

        try {
            f = new FileReader(ruta);
            BufferedReader b = new BufferedReader(f);

            while ((linea = b.readLine()) != null) {

                lectura = linea.split(":");
                if (lectura.length == 3) {
                    Persona p = new Persona(lectura[0], lectura[1], Integer.parseInt(lectura[2]));
                    personas.add(p);
                }
            }

            b.close();

        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        muestraPersona(personas);
        return personas;
    }

    public void muestraPersona(List<Persona> lista) {
        System.out.println("---------Usuarios < 25---------");
        List<Persona> l=lista.stream().filter(persona -> persona.edad>25)
                        .collect(Collectors.toList());

        l.forEach(p -> System.out.println("Nombre: " + p.nombre + ". Poblacion: "+ p.poblacion + ". Edad: " + p.edad));
        /*for (int iterator = 0; iterator < lista.size(); iterator++) {
            System.out.println("Nombre: " + lista.get(iterator).getNombre() + ". Poblacion: " + lista.get(iterator).getPoblacion() + ". Edad: " + lista.get(iterator).getEdad());
        }*/
    }
}