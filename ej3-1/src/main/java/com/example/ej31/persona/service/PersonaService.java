package com.example.ej31.persona.service;

import com.example.ej31.persona.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.ej31.persona.infraestructure.controller.dto.output.PersonaOutputDTO;

import java.util.List;

public interface PersonaService {

    PersonaOutputDTO crearPersona(PersonaInputDTO personaInputDTO);

    List<PersonaOutputDTO> mostrarPersonas();

    PersonaOutputDTO mostrarPersonaId(String id_Persona);

    PersonaOutputDTO mostrarPersona(String username);

    void modificarPersona(String id_Persona, PersonaInputDTO personaInputDTO);

    void borrarPersona(String id_Persona);
}
