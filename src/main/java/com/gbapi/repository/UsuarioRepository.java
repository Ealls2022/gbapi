/*
 * UsuarioRepository.java    17 ene. 2023
 *
 * Copyright (c) 2023 TELCEL
 *
 * Este software es confidencial y contiene información perteneciente
 * a TELCEL.
 *
 */

package com.gbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gbapi.entity.Usuario;

/**
 * @author cruzjl
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
