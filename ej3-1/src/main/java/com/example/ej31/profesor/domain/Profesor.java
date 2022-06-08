package com.example.ej31.profesor.domain;
/*
import com.example.ej31.persona.domain.Persona;
import com.example.ej31.utils.StringPrefixedSequenceIdGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "profesor")
@Getter
@Setter
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_profesor")
    @GenericGenerator(
            name = "id_profesor",
            strategy = "com.example.ej31.utils.StringPrefixedSequenceIdGenerator",
            parameters = {
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "ASI"),
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })

    @OneToOne
    @JoinColumn(name = "id_persona")
    Persona persona;

    @Column(name = "coments")
    private String coments;

    @NotNull
    @Column(name = "branch")
    private String branch;
}
*/