package com.example.ej31.persona.infraestructure.controller;

import com.example.ej31.persona.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.ej31.persona.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.ej31.persona.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class PersonaController {

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
    @GetMapping("persona/{id_Persona}")
    public ResponseEntity<PersonaOutputDTO> mostrarPersonaId(@PathVariable String id_Persona) {
        log.info("Intentando buscar persona con nombre: " + id_Persona);
        return ResponseEntity.ok().body(service.mostrarPersonaId(id_Persona));
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona")
    public ResponseEntity<PersonaOutputDTO> mostrarPersona(@RequestParam String usuario) {
        log.info("Intentando buscar persona con nombre: " + usuario);
        return ResponseEntity.ok().body(service.mostrarPersona(usuario));
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("persona/{id_Persona}")
    public ResponseEntity<Void> modificarPersona(@PathVariable String id_Persona, @RequestBody PersonaInputDTO personaInputDTO) {
        log.info("Intentando actualizar: " + personaInputDTO);
        service.modificarPersona(id_Persona, personaInputDTO);
        return ResponseEntity.ok().build();
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("persona/{id_Persona}")
    public ResponseEntity<Void> borrarPersona(@PathVariable String id_Persona) {
        log.info("Intentando borrar persona con id: " + id_Persona);
        service.borrarPersona(id_Persona);
        return ResponseEntity.ok().build();

    }
}
