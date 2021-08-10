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
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Diana
 */
@Data
@Entity
@Table(name = "seg_usuario")

public class SegUsuario implements Serializable {

       @Id
    @Column(name = "cod_usuario", nullable = false, length = 30)
    private String codigo;
    
    @Column(name = "nombre", length = 150)
    private String nombre;
    
    @Column(name = "identificacion", length = 30)
    private String identificacion;
    
    @Column(name = "email", length = 250)
    private String email;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;
    
    @Column(name = "nro_intentos_fallidos")
    private Integer numeroIntentosFallidos;
    
    @Column(name = "fecha_ultima_sesion")
    @Temporal(TemporalType.DATE)
    
    private Date fechaUltimaSesion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segUsuario")
    private List<SegRespuestaAutogestion> segRespuestaAutogestionList;

    
}
