package com.example.ej31.estudiante.infraestructure.controller.dto.input;

import com.example.ej31.persona.domain.Persona;
import lombok.Data;

@Data
public class EstudianteInputDTO {

    private String id_estudiante;

    // private Persona id_persona;

    private Integer num_hours_week;

    private String coments;

    private String branch;
}
