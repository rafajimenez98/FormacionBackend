package com.example.beans.principal;

import org.springframework.boot.CommandLineRunner;

public class Segunda implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola desde la clase secundaria");
    }
}