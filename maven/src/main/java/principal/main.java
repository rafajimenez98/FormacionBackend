package principal;

import src.main.backend.ejercicio1_1.principal.Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) throws IOException {
        // Lista que almacenará objetos de personas
        List<Persona> listaPersonas = new ArrayList<>();

        // Instancia de persona sin inicializar
        Persona persona;

        // String que usaremos como auxiliar para leer el fichero
        String cadena = "";

        // Array que almacenará cada una de las partes que le haremos split de la variable cadena
        String [] partes = new String[2];

        // Indicamos el fichero a leer en este caso no usamos ruta absoluta porque se encuentra el fichero en el proyecto
        // FileReader y BufferedReader son clases necesarias para leer el fichero
        File file = new File("datos.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        // Crearemos un bucle que leerá mientras haga algo qeu leer
        while ((cadena = br.readLine()) != null)
        {
            partes = cadena.split(":");
            Optional<Integer> edad = partes.length <=2 ? Optional.empty() : Optional.of(Integer.parseInt(partes[2]));
            persona = new Persona(partes[0], partes[1].equals("") ? "Desconocida" : partes[1], edad);
            listaPersonas.add(persona);
        }

        /**
         * Hago un stream de la lista y como hay una edad null, no podrá llevar a cabo la comparación, por tanto
         * encapsulo el iterador en un optional y cambio la edad a un imposible para poder llevar a cabo la comparación
        **/
        listaPersonas.stream()
                .filter(p -> {
                    if (p.getEdad() .isEmpty())
                        return false;
                    else
                        return p.getEdad().get() < 25;
                })
                .forEach(p -> System.out.println(p));
    }
}
