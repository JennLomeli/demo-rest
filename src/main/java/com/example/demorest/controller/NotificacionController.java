package com.example.demorest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(NotificacionController.DEFAULT_ROOT_URL)
public class NotificacionController {

	public static final String DEFAULT_ROOT_URL = "/notificacion";
	
	@GetMapping(value = "/{parametro}")
	public ResponseEntity  getEvaluarTest(@PathVariable String parametro) {
		ResponseEntity<?> entity;
		entity = new ResponseEntity<>(parametro, HttpStatus.CREATED);
		System.err.print("\nNotificacion GET: " + parametro);
		return entity;
	}
	
}
