package com.rs1.dependencias.principal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("controlador4")
@Slf4j
public class C4Consultar {
    @Autowired
    private PersonaService personaService;
    @GetMapping("persona/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Persona> verPersonaID(@PathVariable Integer id) {
        List<Persona> personas = personaService.getPersonas();
        log.info("ID de la persona a buscar: " + id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(personas.stream()
                        .filter(persona -> persona.getId().equals(id))
                        .findFirst()
                        .orElseThrow());
    }

    @GetMapping("persona/nombre/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Persona> verPersonaNombre(@PathVariable String nombre) {
        List<Persona> personas = personaService.getPersonas();
        log.info("Nombre de la persona a buscar: " + nombre);
        return ResponseEntity.status(HttpStatus.OK)
                .body(personas.stream()
                        .filter(persona -> persona.getNombre().contentEquals(nombre))
                        .findFirst()
                        .orElseThrow());
    }
}
