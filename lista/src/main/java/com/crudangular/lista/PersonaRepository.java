package com.crudangular.lista;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaRepository extends JpaRepository<Persona, Long>{

	List<Persona> findAll();
	Persona findOne(Long id);
	Persona save(Persona p);
	void delete(Persona p);
	
}
