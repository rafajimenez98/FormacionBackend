package com.example.BP1.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ConstraintViolationException extends RuntimeException {
    public ConstraintViolationException(String message) {
        super(message);
    }
}
