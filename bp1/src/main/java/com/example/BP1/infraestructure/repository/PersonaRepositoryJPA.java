package com.example.BP1.infraestructure.repository;

import com.example.BP1.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepositoryJPA extends JpaRepository<Persona, Integer> {
    Optional<Object> findByUsuario(String usuario);
}
