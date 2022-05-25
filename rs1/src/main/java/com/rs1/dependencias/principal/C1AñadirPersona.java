package com.rs1.dependencias.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C1AñadirPersona {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/addPersona")
    public String addPersona(RequestBody PersonaService personaService){
        return personaService;
    }
}
