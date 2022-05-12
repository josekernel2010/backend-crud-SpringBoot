package com.crudangular.lista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class Controlador {

	@Autowired
	PersonaService service;


	@GetMapping
	public List<Persona> lista() {
		return service.listar();

	}

}