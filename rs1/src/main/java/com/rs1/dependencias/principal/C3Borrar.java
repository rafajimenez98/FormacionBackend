package com.rs1.dependencias.principal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("controlador3")
@Slf4j
public class C3Borrar {

    @Autowired
    private PersonaService personaService;
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("persona/{id}")
    public ResponseEntity<Persona> borrarPersona(@PathVariable Integer id){

        log.info("Intentando borrar la persona con id: " + id);
        return ResponseEntity.status(HttpStatus.OK).body(personaService.borrarPersona(id));
    }

}
