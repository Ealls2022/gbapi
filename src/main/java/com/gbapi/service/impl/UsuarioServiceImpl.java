/*
 * UsuarioServiceImpl.java    17 ene. 2023
 *
 * Copyright (c) 2023 TELCEL
 *
 * Este software es confidencial y contiene información perteneciente
 * a TELCEL.
 *
 */

package com.gbapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbapi.entity.Usuario;
import com.gbapi.repository.UsuarioRepository;
import com.gbapi.service.UsuarioService;

/**
 * @author cruzjl
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	/**
	 * @see com.gbapi.service.UsuarioService#getList()
	 */
	@Override
	public List<Usuario> getList() {
		return usuarioRepository.findAll();
	}

	/**
	 * @see com.gbapi.service.UsuarioService#get(java.lang.Long)
	 */
	@Override
	public Usuario get(Long id) {
		return usuarioRepository.getReferenceById(id);
	}

	/**
	 * @see com.gbapi.service.UsuarioService#save(com.gbapi.entity.Usuario)
	 */
	@Override
	public void save(Usuario usr) {
		usuarioRepository.save(usr);
	}

	/**
	 * @see com.gbapi.service.UsuarioService#update(com.gbapi.entity.Usuario)
	 */
	@Override
	public void update(Usuario usr) {
		usuarioRepository.save(usr);
	}

	/**
	 * @see com.gbapi.service.UsuarioService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		usuarioRepository.deleteById(id);
	}

}
