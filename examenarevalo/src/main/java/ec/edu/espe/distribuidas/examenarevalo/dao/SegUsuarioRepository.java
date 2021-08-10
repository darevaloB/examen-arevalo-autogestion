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
package ec.edu.espe.distribuidas.examenarevalo.dao;

import ec.edu.espe.distribuidas.examenarevalo.model.SegUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Diana
 */
public interface SegUsuarioRepository  extends JpaRepository<SegUsuario, String>{
    
}
