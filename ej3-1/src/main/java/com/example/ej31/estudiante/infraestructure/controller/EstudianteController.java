package com.example.ej31.estudiante.infraestructure.controller;

import com.example.ej31.estudiante.infraestructure.controller.dto.input.EstudianteInputDTO;
import com.example.ej31.estudiante.infraestructure.controller.dto.output.EstudianteOutputDTO;
import com.example.ej31.estudiante.service.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("estudiante")
    public ResponseEntity<EstudianteOutputDTO> crearEstudiante(@RequestBody EstudianteInputDTO estudianteInputDTO) {
        log.info("Intentando agregar: " + estudianteInputDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.crearEstudiante(estudianteInputDTO));
    }

    @GetMapping("estudiantes")
    public List<EstudianteOutputDTO> mostrarEstudiantes() {
        log.info("Mostrando todas los estudiantes");
        return service.mostrarEstudiantes();
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("estudiante/{id_estudiante}")
    public ResponseEntity<EstudianteOutputDTO> mostrarEstudianteId(@PathVariable String id_estudiante,
                                                                   @RequestParam(defaultValue = "simple") String outputType) {
        log.info("Intentando buscar estudiante con id: " + id_estudiante);
        log.info("Valor outputType: " + outputType);
        if (outputType.equals("simple"))
            return ResponseEntity.status(HttpStatus.OK).body(service.mostrarEstudianteId(id_estudiante));
        else if (outputType.equals("full"))
            return ResponseEntity.status(HttpStatus.OK).body(service.mostrarEstudianteId((id_estudiante)));

        return null;
    }
//        log.info("Intentando buscar estudiante con id: " + id_estudiante);
//        return ResponseEntity.ok().body(service.mostrarEstudianteId(id_estudiante));
//    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("estudiante/{id_estudiante}")
    public ResponseEntity<Void> modificarEstudiante(@PathVariable String id_estudiante,
                                                    @RequestBody EstudianteInputDTO estudianteInputDTO) {
        log.info("Intentando actualizar: " + estudianteInputDTO);
        service.modificarEstudiante(id_estudiante, estudianteInputDTO);
        return ResponseEntity.ok().build();
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("estudiante/{id_estudiante}")
    public ResponseEntity<Void> borrarEstudiante(@PathVariable String id_estudiante) {
        log.info("Intentando borrar estudiante con id: " + id_estudiante);
        service.borrarEstudiante(id_estudiante);
        return ResponseEntity.ok().build();

    }
}
