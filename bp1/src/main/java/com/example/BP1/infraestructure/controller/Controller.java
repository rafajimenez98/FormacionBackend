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

    @GetMapping("personas")
    public List<PersonaOutputDTO> mostrarPersonas() {
    log.info("Mostrando todas las personas");
    return service.mostrarPersonas();
}
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona/{id}")
    public ResponseEntity<PersonaOutputDTO> mostrarPersonaId(@PathVariable int id) {
        log.info("Intentando buscar persona con nombre: " + id);
        return ResponseEntity.ok().body(service.mostrarPersonaId(id));
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona")
    public ResponseEntity<PersonaOutputDTO> mostrarPersona(@RequestParam String usuario) {
        log.info("Intentando buscar persona con nombre: " + usuario);
        return ResponseEntity.ok().body(service.mostrarPersona(usuario));
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