package com.example.ej31.utils.exceptions.handle;

import com.example.ej31.utils.exceptions.PersonaNoEncontrada;
import com.example.ej31.utils.exceptions.PersonaYaRegistrada;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.Date;

@RestControllerAdvice
public class CustomErrors extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public final ResponseEntity<ExceptionResponse> handleUnprocesableEntity(ConstraintViolationException ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(PersonaNoEncontrada.class)
    public final ResponseEntity<ExceptionResponse> handleNotFoundException(PersonaNoEncontrada ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(PersonaYaRegistrada.class)
    public final ResponseEntity<ExceptionResponse> handleNotFoundException(PersonaYaRegistrada ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);
    }

}
