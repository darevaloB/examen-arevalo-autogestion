/*
 * Copyright (c) 2021 Diana.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Diana - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.examenarevalo.controller;

import ec.edu.espe.distribuidas.examenarevalo.model.SegPreguntaAutogestion;
import ec.edu.espe.distribuidas.examenarevalo.service.SegPreguntaAutogestionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diana
 */
@RestController
@RequestMapping("/api/segPreguntaAutogestion")
@Slf4j
public class SegPreguntaAutogestionController {

    private final SegPreguntaAutogestionService service;

    public SegPreguntaAutogestionController(SegPreguntaAutogestionService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Obtiene todas las preguntas activas", notes = "Obtiene todas las preguntas activas de la base de datos")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Cuando encuentra todas las preguntas activas"),
        @ApiResponse(code = 404, message = "No existen preguntas activas")
    })
    public ResponseEntity obtenerActivos() {
        List<SegPreguntaAutogestion> preguntas = this.service.listByEstado("ACT");
        try {
            return ResponseEntity.ok(preguntas);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
