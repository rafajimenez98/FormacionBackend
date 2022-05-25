package com.inyeccion.dependencias.principal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("controlador1")
@Slf4j
public class Controlador1 {


    @Autowired
    private PersonaService personaService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("addPersona")
    public ResponseEntity<Persona> crearPersona(
            @RequestHeader String nombre,
            @RequestHeader String poblacion,
            @RequestHeader Integer edad) {

        log.info("Nombre: " + nombre + ", " + "Poblacion: " + poblacion + ", " + "Edad: " + edad);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(personaService.crearPersona(nombre, poblacion, edad));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("addCiudad")
    public ResponseEntity<Void> crearCiudad(@RequestBody Ciudad ciudad) {

        log.info("Recibido: " + ciudad);
        personaService.addCiudad(ciudad);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
