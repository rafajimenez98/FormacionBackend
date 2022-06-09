//package com.example.ej31.profesor.domain;
//
//import com.example.ej31.estudiante.domain.Estudiante;
//import com.example.ej31.persona.domain.Persona;
//import com.example.ej31.utils.StringPrefixedSequenceIdGenerator;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.List;
//
//@Entity
//@Table(name = "profesor")
//@Getter
//@Setter
//public class Profesor {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_profesor")
//    @GenericGenerator(
//            name = "id_profesor",
//            strategy = "com.example.ej31.utils.StringPrefixedSequenceIdGenerator",
//            parameters = {
//                @org.hibernate.annotations.Parameter(
//                        name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
//                @org.hibernate.annotations.Parameter(
//                        name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = ""),
//                @org.hibernate.annotations.Parameter(
//                        name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%d")
//            })
//
//    @Column(name = "id_profesor")
//    private String id_profesor;
//
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "id_persona")
//    private Persona persona;
//
//    @Column(name = "coments")
//    private String coments;
//
//    @NotNull
//    @Column(name = "branch", columnDefinition = "VARCHAR(10) CHECK (branch IN ('FRONT', 'BACK', 'FULLSTACK'))")
//    private String branch;
//
//    @OneToMany
//    private List<Estudiante> estudiantes;
//}