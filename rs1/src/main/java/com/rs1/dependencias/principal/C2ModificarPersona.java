package com.rs1.dependencias.principal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("controlador2")
@Slf4j
public class C2ModificarPersona {

    @Autowired
    private PersonaService personaService;
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("persona/{id}")
    public ResponseEntity<Object> modificarPersona(@PathVariable Integer id, @RequestBody Persona persona){

        log.info("Intentando modificar la persona con id: " + id);
        return ResponseEntity.status(HttpStatus.OK).body(personaService.modificarPersona(id));
    }

}