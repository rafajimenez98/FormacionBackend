package com.example.bs4.principal;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component
@Profile("profile2")
public class profile2 implements Profiles {

    String profile = "Soy el profile2";

    @Override
    public void myFunction() {
        System.out.println("Este es el profile2");
    }

    public String getProfile() {
        return profile;
    }

}