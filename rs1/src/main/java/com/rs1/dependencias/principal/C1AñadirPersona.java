package com.rs1.dependencias.principal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("controlador1")
@Slf4j
public class C1AñadirPersona {
    @Autowired
    private PersonaService personaService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("persona")
    public ResponseEntity<Persona> crearPersona(
            @RequestHeader Integer id,
            @RequestHeader String nombre,
            @RequestHeader String poblacion,
            @RequestHeader Integer edad) {

        log.info("ID: "+ id + ", " + "Nombre: " + nombre + ", " + "Edad: " + edad + ", " + "Poblacion: " + poblacion);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(personaService.crearPersona(id, nombre, edad, poblacion));
    }
}
