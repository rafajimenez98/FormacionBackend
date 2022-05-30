package com.rs1.dependencias.principal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("controlador")
@Slf4j
public class Controllers {
    @Autowired
    private PersonaService personaService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("persona")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {

        log.info("Intentando añadir la persona con Nombre: " + persona.getNombre() + ", " + "Edad: " + persona.getEdad() + ", " + "Poblacion: " + persona.getPoblacion());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(personaService.crearPersona(persona.getNombre(), persona.getEdad(), persona.getPoblacion()));
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("persona/{id}")
    public ResponseEntity<Object> modificarPersona(@PathVariable Integer id, @RequestBody Persona persona) {

        log.info("Intentando modificar la persona con id: " + id);
        return (ResponseEntity<Object>) ResponseEntity.status(HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("persona/{id}")
    public ResponseEntity<Persona> borrarPersona(@PathVariable Integer id) {

        log.info("Intentando borrar la persona con id: " + id);
        return ResponseEntity.status(HttpStatus.OK).body(personaService.borrarPersona(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona/{id}")
    public ResponseEntity<Object> verPersonaID(@PathVariable Integer id) {

        log.info("ID de la persona a buscar: " + id);
        return ResponseEntity.status(HttpStatus.OK).body(personaService.consultarPersonaID(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("persona/nombre/{nombre}")
    public ResponseEntity<Object> verPersonaNombre(@PathVariable String nombre) {

        log.info("Nombre de la persona a buscar: " + nombre);
        return ResponseEntity.status(HttpStatus.OK).body(personaService.consultarPersonaNombre(nombre));
    }
}


