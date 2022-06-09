package com.example.ej31.estudiante.service;

import com.example.ej31.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.ej31.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.ej31.persona.infraestructure.controller.dto.output.PersonaOutputDTO;

import java.util.List;

public interface EstudianteService {
    PersonaOutputDTO crearEstudiante(EstudianteInputDTO estudianteInputDTO);

    List<EstudianteOutputDTO> mostrarEstudiante();

    PersonaOutputDTO mostrarEstudianteId(String id_Estudiante);

    PersonaOutputDTO mostrarEstudiante(String username);

    void modificarEstudiante(String id_Estudiante, EstudianteInputDTO estudianteInputDTO);

    void borrarEstudiante(String id_Estudiante);
}
