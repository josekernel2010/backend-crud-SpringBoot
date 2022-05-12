package com.crudangular.lista;

import java.util.List;

import org.springframework.stereotype.Service;



public interface PersonaService {
	
	
	List<Persona> listar();
	Persona listarId(Long id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(Long id);
}
