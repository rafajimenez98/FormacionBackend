package com.example.BP1.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonaYaRegistrada extends RuntimeException {
    public PersonaYaRegistrada(String message) {
        super(message);
    }
}