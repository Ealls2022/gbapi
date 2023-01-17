/*
 * UsuarioController.java    17 ene. 2023
 *
 * Copyright (c) 2023 TELCEL
 *
 * Este software es confidencial y contiene información perteneciente
 * a TELCEL.
 *
 */

package com.gbapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gbapi.entity.Usuario;
import com.gbapi.service.UsuarioService;


/**
 * @author cruzjl
 */
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> getList(){
		List<Usuario> usrs = usuarioService.getList();
		return usrs;
	}
	
	@GetMapping("/get")
	public Usuario get(){
		Usuario usr = usuarioService.get(1L);
		return usr;
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody Usuario usr) {
		usuarioService.save(usr); 
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
	
}
