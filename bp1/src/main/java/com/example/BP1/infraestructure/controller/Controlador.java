package com.example.BP1.infraestructure.controller;

import com.example.BP1.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.BP1.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.BP1.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
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
    public ResponseEntity<PersonaOutputDTO> addPersona(@RequestBody PersonaInputDTO personaInputDTO) {
        log.info("Intentando agregar: " + personaInputDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addPersona(personaInputDTO));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin(origins = " https://codepen.io/de4imo/pen/VwMRENP")
    @PostMapping("addperson")
    public ResponseEntity<PersonaOutputDTO> addPerson(
            @RequestBody PersonaInputDTO personaInputDTO) {
        log.info("a ver..." + personaInputDTO);
        PersonaOutputDTO personaOutputDTO = new PersonaOutputDTO();
        BeanUtils.copyProperties(personaInputDTO, personaOutputDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaOutputDTO);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona/{id}")
    public ResponseEntity<Object> getPersona(
            @PathVariable int id,
            @RequestParam(defaultValue = "simple") String outputType) {
        log.info("Intentando buscar persona con id: " + id + ", output: " + outputType);
        return ResponseEntity.ok().body(service.getPersona(id, outputType));
    }

    @GetMapping("personas")
    public List<PersonaOutputDTO> getPersonas() {
        log.info("Mostrando todas las personas");
        return service.getPersonas();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona")
    public ResponseEntity<PersonaOutputDTO> getPersona(@RequestParam String username) {
        log.info("Intentando buscar persona con nombre: " + username);
        return ResponseEntity.ok().body(service.getPersonaByUser(username));
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("persona/{id}")
    public ResponseEntity<Void> actPersona(@PathVariable int id, @RequestBody PersonaInputDTO personaInputDTO) {
        log.info("Intentando actualizar: " + personaInputDTO);
        service.actPersona(id, personaInputDTO);
        return ResponseEntity.ok().build();
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("persona/{id}")
    public ResponseEntity<Void> delPersona(@PathVariable int id) {
        log.info("Intentando borrar persona con id: " + id);
        service.delPersona(id);
        return ResponseEntity.ok().build();

    }
}