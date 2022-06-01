package com.example.bs4.principal;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/controller")
@PropertySource("classpath:application.properties")
@PropertySource("classpath:configuration.properties")
public class GetController {

    @Autowired
    Profiles profiles;

    @GetMapping("/values")
    public String getValue(@Value("${variable1}") String variable1, @Value("${my.variable2}") int variable2) {
        return "Mi variable 1 es: " + variable1 + " y mi variable 2 es: " + variable2;
    }

    @GetMapping("/var3")
    public String getVar3(@Value("${VAR3:var3 no tiene valor}") String variable3) {
        return "Mi variable 3 es: " + variable3;
    }

    @GetMapping("/parametros")
    public String getParametros(@Value("${url}") String url, @Value("${password}") String password) {
        return "La url es: " + url + " y la password es: " + password;
    }

    @GetMapping("/parametros2")
    public String getParametros2(@Value("${valor1}") String valor1, @Value("${valor2}") String valor2) {
        return "Mi valor 1 es: " + valor1 + " y valor 2 es: " + valor2;
    }

    @GetMapping("/profile")
    public String getProfile() {
        return profiles.getProfile();
    }

}