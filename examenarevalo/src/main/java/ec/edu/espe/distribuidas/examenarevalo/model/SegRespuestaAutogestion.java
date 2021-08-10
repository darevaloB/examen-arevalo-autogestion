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
package ec.edu.espe.distribuidas.examenarevalo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Diana
 */

@Data
@Entity
@Table(name = "seg_respuesta_autogestion")

public class SegRespuestaAutogestion implements Serializable {

    @EmbeddedId
    private SegRespuestaAutogestionPK PK;
   
    @Column(name = "respuesta", length = 100)
    private String respuesta;
    
    @JoinColumn(name = "cod_pregunta", referencedColumnName = "cod_pregunta", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegPreguntaAutogestion segPreguntaAutogestion;
    
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegUsuario segUsuario;



}
