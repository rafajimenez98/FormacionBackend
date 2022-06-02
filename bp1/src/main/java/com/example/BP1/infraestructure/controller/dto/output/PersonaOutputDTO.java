package com.example.BP1.infraestructure.controller.dto.output;

import com.example.BP1.domain.Persona;
import lombok.Data;

import java.util.Date;

@Data
public class PersonaOutputDTO {
    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;
}
