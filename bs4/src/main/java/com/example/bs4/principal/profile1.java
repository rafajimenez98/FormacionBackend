package com.example.bs4.principal;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component
@Profile("profile1")
public class profile1 implements Profiles {

    String profile = "Soy el profile1";

    @Override
    public void myFunction() {
        System.out.println("Este es el profile1");
    }

    public String getProfile() {
        return profile;
    }
}