package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController()
public class Controlador1 {

    @GetMapping("/hola")
    public String getHola(){
        return "Hola mundo";
    }

    @GetMapping("/user/{nombre}")
    public String getHolaUser(@PathVariable(value = "nombre") String nombre)
    {
        return ("Hola "+ nombre);
    }

    @PostMapping("/useradd")
    public Persona createUser (@RequestBody Persona persona)
    {
        return persona;
    }

}
