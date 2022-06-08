package com.example.ej31.estudiante.domain;
/*
import com.example.ej31.estudiante_asignatura.domain.Estudiante_Asignatura;
import com.example.ej31.persona.domain.Persona;
import com.example.ej31.profesor.domain.Profesor;
import com.example.ej31.utils.StringPrefixedSequenceIdGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "estudiante")
@Getter
@Setter
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_estudiante")
    @GenericGenerator(
            name = "id_estudiante",
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

    @NotNull
    @Column(name = "horas_por_semana")
    Integer num_hours_week;

    @Column(name = "comentarios")
    String coments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor")
    Profesor profesor;

    @NotNull
    @Column(name = "rama")
    String branch;
//
//    @OneToMany
//    List<Estudiante_Asignatura> asignatura;
}
*/