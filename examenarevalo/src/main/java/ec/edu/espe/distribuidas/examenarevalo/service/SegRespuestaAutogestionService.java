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
package ec.edu.espe.distribuidas.examenarevalo.service;

import ec.edu.espe.distribuidas.examenarevalo.dao.SegRespuestaAutogestionRepository;
import ec.edu.espe.distribuidas.examenarevalo.dao.SegUsuarioRepository;
import ec.edu.espe.distribuidas.examenarevalo.exception.CreateException;
import ec.edu.espe.distribuidas.examenarevalo.model.SegPreguntaAutogestion;
import ec.edu.espe.distribuidas.examenarevalo.model.SegRespuestaAutogestion;
import ec.edu.espe.distribuidas.examenarevalo.model.SegUsuario;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diana
 */
@Service
@Slf4j
public class SegRespuestaAutogestionService {

    private final SegRespuestaAutogestionRepository segRespuestaAutogestionRepo;
    private final SegUsuarioRepository segUsuarioRepositoryRepo;

    public SegRespuestaAutogestionService(SegRespuestaAutogestionRepository segRespuestaAutogestionRepo,
            SegUsuarioRepository segUsuarioRepositoryRepo) {
        this.segRespuestaAutogestionRepo = segRespuestaAutogestionRepo;
        this.segUsuarioRepositoryRepo = segUsuarioRepositoryRepo;
    }

    @Transactional
    public void insertarRespuestas(SegRespuestaAutogestion segRespuestaAutogestion) {
        log.info("respuesta: {}", segRespuestaAutogestion);
        SegUsuario segsuario = segRespuestaAutogestion.getSegUsuario();
        SegPreguntaAutogestion pregunta = segRespuestaAutogestion.getSegPreguntaAutogestion();
        
        try {
            this.segRespuestaAutogestionRepo.save(segRespuestaAutogestion);
        } catch (Exception e) {
            throw new CreateException(e.getMessage());
        }

    }

}
