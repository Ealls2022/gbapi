/*
 * Usuario.java    17 ene. 2023
 *
 * Copyright (c) 2023 TELCEL
 *
 * Este software es confidencial y contiene información perteneciente
 * a TELCEL.
 *
 */

package com.gbapi.entity;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;

/**
 * @author cruzjl
 */
@Entity
@Table
//@Data
public class Usuario implements Serializable{

	@Id
	@GeneratedValue
//	@Column(name = "id")
	private Long id;
	
//	@Column(name = "nombre")
	private String nombre;
	
//	@Column(name = "a_paterno")
	private String apellidoPaterno;
	
//	@Column(name = "a_materno")
	private String apellidoMaterno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
	
	
	
}
