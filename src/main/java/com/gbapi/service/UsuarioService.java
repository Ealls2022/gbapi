/*
 * UsuarioService.java    17 ene. 2023
 *
 * Copyright (c) 2023 TELCEL
 *
 * Este software es confidencial y contiene información perteneciente
 * a TELCEL.
 *
 */

package com.gbapi.service;

import java.util.List;

import com.gbapi.entity.Usuario;

/**
 * @author cruzjl
 */
public interface UsuarioService {

	List<Usuario> getList();
	
	Usuario get(Long id);
	
	void save(Usuario usr);
	
	void update(Usuario usr);
	
	void delete(Long id);
}
