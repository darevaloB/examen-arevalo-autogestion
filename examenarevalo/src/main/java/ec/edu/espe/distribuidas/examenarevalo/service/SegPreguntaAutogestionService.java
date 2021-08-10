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

import ec.edu.espe.distribuidas.examenarevalo.dao.SegPreguntaAutogestionRepository;
import ec.edu.espe.distribuidas.examenarevalo.exception.CreateException;
import ec.edu.espe.distribuidas.examenarevalo.model.SegPreguntaAutogestion;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diana
 */
@Service
@Slf4j
public class SegPreguntaAutogestionService {

    private final SegPreguntaAutogestionRepository segPreguntaAutogestionRepo;

    public SegPreguntaAutogestionService(SegPreguntaAutogestionRepository segPreguntaAutogestionRepo) {
        this.segPreguntaAutogestionRepo = segPreguntaAutogestionRepo;

    }

    public List<SegPreguntaAutogestion> listByEstado(String estado) {
        if(estado.equals("ACT")){
          return this.segPreguntaAutogestionRepo.findByEstado(estado);
        } else {
            throw new CreateException("No existen Preguntas de autogestion con estado ACT");
        }
      
    }
    
    
    
    
}
