package com.example.ej31.estudiante.infraestructure.controller.mapper;

import com.example.ej31.estudiante.domain.Estudiante;
import com.example.ej31.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.ej31.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import org.mapstruct.Mapper;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
@Validated
public interface EstudianteMapper {

    @Valid Estudiante toEntity(EstudianteInputDTO estudianteDTO);

    EstudianteOutputDTO toDTO(@Valid Estudiante estudiante);

    default List<EstudianteOutputDTO> toDTOList(@Valid List<Estudiante> estudiantes) {
        if (estudiantes == null) {
            return new ArrayList<>();
        }
        return estudiantes.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
