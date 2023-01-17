/*
 * LoginController.java    17 ene. 2023
 *
 * Copyright (c) 2023 TELCEL
 *
 * Este software es confidencial y contiene información perteneciente
 * a TELCEL.
 *
 */

package com.gbapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cruzjl
 */
@RestController
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "Login";
	}
}
