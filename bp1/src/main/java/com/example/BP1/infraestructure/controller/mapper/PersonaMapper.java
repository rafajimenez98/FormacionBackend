package com.example.BP1.infraestructure.controller.mapper;

import com.example.BP1.domain.Persona;
import com.example.BP1.infraestructure.controller.dto.input.PersonaInputDTO;
import com.example.BP1.infraestructure.controller.dto.output.PersonaOutputDTO;
import org.mapstruct.Mapper;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
@Validated
public interface PersonaMapper {

    @Valid Persona toEntity(PersonaInputDTO personaDTO);

    PersonaOutputDTO toDTO(@Valid Persona persona);

    default List<PersonaOutputDTO> toDTOList(@Valid List<Persona> personas) {
        if (personas == null) {
            return new ArrayList<>();
        }
        return personas.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
