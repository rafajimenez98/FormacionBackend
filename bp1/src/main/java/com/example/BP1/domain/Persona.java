package com.example.BP1.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size
    private String usuario;

    @NotNull
    private String password;

    @NotNull
    private String name;

    private String surname;

    @NotNull
    private String company_email;

    @NotNull
    private String personal_email;

    @NotNull
    private String city;

    @NotNull
    private Boolean active;

    @NotNull
    private Date created_date;

    private String imagen_url;

    private Date termination_date;

}
