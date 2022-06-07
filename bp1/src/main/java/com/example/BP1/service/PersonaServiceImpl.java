package com.example.BP1.service;

import com.example.BP1.domain.Persona;
import com.example.BP1.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.BP1.infraestructure.controller.dto.output.PersonaOutputDTO;
import com.example.BP1.infraestructure.controller.mapper.PersonaMapper;
import com.example.BP1.infraestructure.repository.PersonaRepositoryJPA;
import com.example.BP1.utils.exceptions.PersonaNoEncontrada;
import com.example.BP1.utils.exceptions.PersonaYaRegistrada;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolationException;

@Slf4j
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepositoryJPA repository;

    @Autowired
    private PersonaMapper mapper;

    @Override
    public PersonaOutputDTO crearPersona(PersonaInputDTO personaInputDTO) throws ConstraintViolationException {
        if (repository.findByUsuario(personaInputDTO.getUsuario()).isPresent())
            throw new PersonaYaRegistrada("Usuario ya registrado") ;
        return mapper.toDTO(repository.save(mapper.toEntity(personaInputDTO)));

    }

    @Override
    public PersonaOutputDTO mostrarPersonaId(Integer id) {
        return mapper.toDTO((Persona) repository
                .findById(id)
                .orElseThrow(() -> new PersonaNoEncontrada(
                        ("Persona con id: " + id + ", no encontrado"))));
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
    public void modificarPersona(Integer id, PersonaInputDTO personaInputDTO) throws ConstraintViolationException {
        Persona persona =
                repository.findById(id)
                        .orElseThrow(() ->
                                new PersonaNoEncontrada("Persona con id: " + id + ", no encontrada"));

        BeanUtils.copyProperties(personaInputDTO, persona);
        repository.save(persona);
    }

    @Override
    public void borrarPersona(Integer id) {
        repository.delete((repository
                .findById(id)
                .orElseThrow(() -> new PersonaNoEncontrada(
                        ("Persona con id: " + id + ", no encontrado")))));
    }
}