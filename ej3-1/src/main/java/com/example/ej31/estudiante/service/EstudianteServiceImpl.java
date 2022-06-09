package com.example.ej31.estudiante.service;

import com.example.ej31.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.ej31.persona.domain.Persona;
import com.example.ej31.persona.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.ej31.persona.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.ej31.persona.infraestructure.controller.mapper.PersonaMapper;
import com.example.ej31.persona.infraestructure.repository.PersonaRepositoryJPA;
import com.example.ej31.utils.exceptions.PersonaNoEncontrada;
import com.example.ej31.utils.exceptions.PersonaYaRegistrada;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;
import java.util.List;

@Slf4j
@Service
public class EstudianteServiceImpl {
    @Autowired
    private PersonaRepositoryJPA repository;

    @Autowired
    private PersonaMapper mapper;

    @Override
    public PersonaOutputDTO crearEstudiante(EstudianteInputDTO estudianteInputDTO) throws ConstraintViolationException {
        if (repository.findByUsuario(estudianteInputDTO.getUsuario()).isPresent())
            throw new PersonaYaRegistrada("Usuario ya registrado") ;
        return mapper.toDTO(repository.save(mapper.toEntity(estudianteInputDTO)));

    }

    @Override
    public PersonaOutputDTO mostrarPersonaId(String id_Persona) {
        return mapper.toDTO((Persona) repository
                .findByIdPersona(id_Persona)
                .orElseThrow(() -> new PersonaNoEncontrada(
                        ("Persona con id: " + id_Persona + ", no encontrado"))));
    }

    @Override
    public PersonaOutputDTO mostrarPersona(String usuario) {
        return mapper.toDTO((Persona) repository
                .findByUsuario(usuario)
                .orElseThrow(() -> new PersonaNoEncontrada(
                        ("Usuario: " + usuario + ", no encontrado"))));
    }

    @Override
    public List<PersonaOutputDTO> mostrarPersonas() {
        return mapper.toDTOList(repository.findAll());
    }

    @Override
    public void modificarPersona(String id_Persona, PersonaInputDTO personaInputDTO) throws ConstraintViolationException {
        Persona persona =
                repository.findByIdPersona(id_Persona)
                        .orElseThrow(() ->
                                new PersonaNoEncontrada("Persona con id: " + id_Persona + ", no encontrada"));

        BeanUtils.copyProperties(personaInputDTO, persona);
        repository.save(persona);
    }

    @Override
    public void borrarPersona(String id_Persona) {
        repository.delete((repository
                .findByIdPersona(id_Persona)
                .orElseThrow(() -> new PersonaNoEncontrada(
                        ("Persona con id: " + id_Persona + ", no encontrado")))));
    }
}

}
