package com.example.ej31.persona.infraestructure.repository;

import com.example.ej31.persona.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepositoryJPA extends JpaRepository<Persona, Integer> {
    Optional<Persona> findByUsuario(String usuario);
    Optional<Persona> findByIdPersona(String id_Persona);
}