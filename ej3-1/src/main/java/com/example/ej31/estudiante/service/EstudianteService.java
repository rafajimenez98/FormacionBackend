package com.example.ej31.estudiante.service;

import com.example.ej31.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.ej31.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;

import java.util.List;

public interface EstudianteService {
    EstudianteOutputDTO crearEstudiante(EstudianteInputDTO estudianteInputDTO);

    List<EstudianteOutputDTO> mostrarEstudiantes();

    EstudianteOutputDTO mostrarEstudianteId(String id_estudiante);

    void modificarEstudiante(String id_estudiante, EstudianteInputDTO estudianteInputDTO);

    void borrarEstudiante(String id_estudiante);
}
