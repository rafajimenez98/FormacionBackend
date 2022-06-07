package com.example.BP1.service;

import com.example.BP1.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.BP1.infraestructure.controller.dto.output.PersonaOutputDTO;

import java.util.List;

public interface PersonaService {

    PersonaOutputDTO crearPersona(PersonaInputDTO personaInputDTO);

    List<PersonaOutputDTO> mostrarPersonas();

    PersonaOutputDTO mostrarPersonaId(Integer id);

    PersonaOutputDTO mostrarPersona(String username);

    void modificarPersona(Integer id, PersonaInputDTO personaInputDTO);

    void borrarPersona(Integer id);
}