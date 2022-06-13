package com.example.ej31.estudiante.infraestructure.repository;

import com.example.ej31.estudiante.domain.Estudiante;
import com.example.ej31.persona.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudianteRepositoryJPA extends JpaRepository<Estudiante, Integer> {

    Optional<Estudiante> findByIdEstudiante(String id_estudiante);
}
