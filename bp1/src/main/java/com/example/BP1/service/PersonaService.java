package com.example.BP1.service;

import com.example.BP1.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.BP1.infraestructure.controller.dto.output.PersonaOutputDTO;

import java.util.List;

public interface PersonaService {

    PersonaOutputDTO addPersona(PersonaInputDTO personaInputDTO);

    Object getPersona(Integer id, String outputType);

    List<PersonaOutputDTO> getPersonas();

    PersonaOutputDTO getPersonaByUser(String username);

    void actPersona(int id, PersonaInputDTO personaInputDTO);

    void delPersona(int id);
}