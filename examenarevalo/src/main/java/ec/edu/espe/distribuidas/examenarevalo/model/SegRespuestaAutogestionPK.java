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
import javax.persistence.Embeddable;

/**
 *
 * @author Diana
 */
@Embeddable
public class SegRespuestaAutogestionPK implements Serializable {

    @Column(name = "cod_usuario", nullable = false, length = 30)
    private String codigo;

    @Column(name = "cod_pregunta", nullable = false)
    private int codigoPregunta;

    public SegRespuestaAutogestionPK() {
    }
}
