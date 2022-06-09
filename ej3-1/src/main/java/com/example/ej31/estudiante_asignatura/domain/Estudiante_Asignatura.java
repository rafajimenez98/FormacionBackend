//package com.example.ej31.estudiante_asignatura.domain;
//import com.example.ej31.asignatura.domain.Asignatura;
//import com.example.ej31.estudiante.domain.Estudiante;
//import com.example.ej31.profesor.domain.Profesor;
//import com.example.ej31.utils.StringPrefixedSequenceIdGenerator;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//
//@Entity
//@Table(name = "estudios")
//@Getter
//@Setter
//
//public class Estudiante_Asignatura {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_estudiante_asignatura")
//    @GenericGenerator(
//            name = "id_estudiante_asignatura",
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
//    @Column
//    String id_estudiante_asignatura;
//
//    @ManyToOne
//    @JoinColumn(name = "id_asignatura")
//    Asignatura asignatura;
//
//    @ManyToOne
//    @JoinColumn(name = "id_estudiante")
//    Estudiante estudiante;
//
//
//    @Column(name = "comments")
//    String comments;
//
//    @NotNull
//    @Column(name = "initial_date")
//    Date initial_date;
//
//    @NotNull
//    @Column(name = "finish_date")
//    Date finish_date;
//}
