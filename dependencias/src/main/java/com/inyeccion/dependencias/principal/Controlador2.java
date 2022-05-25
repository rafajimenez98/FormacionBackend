package com.inyeccion.dependencias.principal;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("controlador2")
@Slf4j
public class Controlador2 {

    @Autowired
    private PersonaService personaService;

    @Autowired
    Controlador1 controlador1;

    @GetMapping("getPersona/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Persona> verPersona(@PathVariable String nombre) {
        List<Persona> personas = personaService.getPersonas();
        log.info("Nombre de persona a buscar: " + nombre);
        return ResponseEntity.status(HttpStatus.OK)
                .body(personas.stream()
                        .filter(persona -> persona.getNombre().contentEquals(nombre))
                        .findFirst()
                        .orElseThrow());
    }

    @GetMapping("getPersonas")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Persona>> verPersonas() {
        return ResponseEntity.status(HttpStatus.OK).body(personaService.getPersonas());
    }

    @GetMapping("getCiudades")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Ciudad>> verCiudades() {
        return ResponseEntity.status(HttpStatus.OK).body(personaService.getCiudades());
    }
}
