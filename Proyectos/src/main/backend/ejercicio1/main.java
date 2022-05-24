package src.main.backend.ejercicio1;

import src.main.backend.ejercicio1.principal.Persona;
import src.main.backend.ejercicio1.principal.Lector;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Lector f = new Lector("datos.txt");
        List<Persona> listaPersonas = f.lectura();
    }
}