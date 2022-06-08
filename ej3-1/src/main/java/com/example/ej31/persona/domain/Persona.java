package com.example.ej31.persona.domain;

import com.example.ej31.utils.StringPrefixedSequenceIdGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Persona")
    @GenericGenerator(
            name = "id_Persona",
            strategy = "com.example.ej31.utils.StringPrefixedSequenceIdGenerator",
            parameters = {
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = ""),
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%d")
            })
    @Column(name ="id_Persona")
    private String idPersona;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "company_email")
    private String company_email;

    @Column(name = "personal_email")
    private String personal_email;

    @Column(name = "city")
    private String city;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_date")
    private Date created_date;

    @Column(name = "imagen_url")
    private String imagen_url;

    @Column(name = "termination_date")
    private Date termination_date;

}


