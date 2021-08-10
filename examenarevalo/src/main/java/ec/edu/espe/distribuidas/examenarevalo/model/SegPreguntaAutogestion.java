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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Diana
 */
@Data
@Entity
@Table(name = "seg_pregunta_autogestion")

public class SegPreguntaAutogestion implements Serializable {

    @Id
    @Column(name = "cod_pregunta", nullable = false)
    private Integer codigoPregunta;

    @Column(name = "enunciado", length = 100)
    private String enunciado;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segPreguntaAutogestion")
    private List<SegRespuestaAutogestion> segRespuestaAutogestionList;

}
