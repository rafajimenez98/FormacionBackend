package com.example.bs5.principal;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Errores {
    String error;

    public void pruebas(){
        log.error("Error error");
        log.warn("Eror warn");
    }
}
