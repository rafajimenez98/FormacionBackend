package com.example.ej31.estudiante.service;

import com.example.ej31.estudiante.domain.Estudiante;
import com.example.ej31.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.ej31.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.ej31.estudiante.infraestructure.controller.mapper.EstudianteMapper;
import com.example.ej31.estudiante.infraestructure.repository.EstudianteRepositoryJPA;
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
    private EstudianteRepositoryJPA repository;

    @Autowired
    private EstudianteMapper mapper;


    public EstudianteOutputDTO crearEstudiante(EstudianteInputDTO estudianteInputDTO) throws ConstraintViolationException {
        if (repository.findByIdEstudiante(estudianteInputDTO.getId_estudiante()).isPresent())
            throw new PersonaYaRegistrada("Usuario ya registrado") ;
        return mapper.toDTO(repository.save(mapper.toEntity(estudianteInputDTO)));

    }

    public EstudianteOutputDTO mostrarEstudianteId(String id_estudiante) {
        return mapper.toDTO((Estudiante) repository
                .findByIdEstudiante(id_estudiante)
                .orElseThrow(() -> new PersonaNoEncontrada(
                        ("Persona con id: " + id_estudiante + ", no encontrado"))));
    }

    public List<EstudianteOutputDTO> mostrarEstudiantes() {
        return mapper.toDTOList(repository.findAll());
    }

     public void modificarEstudiante(String id_estudiante, EstudianteInputDTO estudianteInputDTO) throws ConstraintViolationException {
        Estudiante estudiante =
                repository.findByIdEstudiante(id_estudiante)
                        .orElseThrow(() ->
                                new PersonaNoEncontrada("Persona con id: " + id_estudiante + ", no encontrada"));

        BeanUtils.copyProperties(estudianteInputDTO, estudiante);
        repository.save(estudiante);
    }

    public void borrarEstudiante(String id_estudiante) {
        repository.delete((repository
                .findByIdEstudiante(id_estudiante)
                .orElseThrow(() -> new PersonaNoEncontrada(
                        ("Persona con id: " + id_estudiante + ", no encontrado")))));
    }
}
