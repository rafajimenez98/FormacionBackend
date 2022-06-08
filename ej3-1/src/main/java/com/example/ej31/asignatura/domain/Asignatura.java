package com.example.ej31.asignatura.domain;
/*
import com.example.ej31.estudiante.domain.Estudiante;
import com.example.ej31.profesor.domain.Profesor;
import com.example.ej31.utils.StringPrefixedSequenceIdGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudios")
@Getter
@Setter

public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_asignatura")
    @GenericGenerator(
            name = "id_asignatura",
            strategy = "com.example.ej31.utils.StringPrefixedSequenceIdGenerator",
            parameters = {
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "ASI"),
                @org.hibernate.annotations.Parameter(
                        name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%08d")
            })

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id")
    Profesor profesor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student")
    Estudiante estudiante;

    @Column(name = "asignatura")
    String asignatura;

    @Column(name = "comentarios")
    String comment;

    @Column(name = "initial_date")
    Date initial_date;

    @Column(name = "finish_date")
    Date finish_date;
}
*/
