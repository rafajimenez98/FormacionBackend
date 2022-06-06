package com.example.BP1.infraestructure.controller;

import com.example.BP1.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.BP1.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.BP1.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class Controller {

    @Autowired
    private PersonaService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("persona")
    public ResponseEntity<PersonaOutputDTO> crearPersona(@RequestBody PersonaInputDTO personaInputDTO) {
        log.info("Intentando agregar: " + personaInputDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.crearPersona(personaInputDTO));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona/{id}")
    public ResponseEntity<Object> verPersonaId(
            @PathVariable int id,
            @RequestParam(defaultValue = "simple") String outputType) {
        log.info("Intentando buscar persona con id: " + id + ", output: " + outputType);
        return ResponseEntity.ok().body(service.mostrarPersonaId(id, outputType));
    }

    @GetMapping("personas")
    public List<PersonaOutputDTO> verPersonas() {
        log.info("Mostrando todas las personas");
        return service.mostrarPersonas();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona")
    public ResponseEntity<PersonaOutputDTO> verPersonaId(@RequestParam String username) {
        log.info("Intentando buscar persona con nombre: " + username);
        return ResponseEntity.ok().body(service.mostrarPersona(username));
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("persona/{id}")
    public ResponseEntity<Void> modificarPersona(@PathVariable int id, @RequestBody PersonaInputDTO personaInputDTO) {
        log.info("Intentando actualizar: " + personaInputDTO);
        service.modificarPersona(id, personaInputDTO);
        return ResponseEntity.ok().build();
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("persona/{id}")
    public ResponseEntity<Void> borrarPersona(@PathVariable int id) {
        log.info("Intentando borrar persona con id: " + id);
        service.borrarPersona(id);
        return ResponseEntity.ok().build();

    }
}