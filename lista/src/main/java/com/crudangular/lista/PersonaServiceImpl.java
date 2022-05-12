package com.crudangular.lista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	

	@Autowired
	private PersonaRepository repositorio;
	



	@Override
	public List<Persona> listar() {
		
		return repositorio.findAll();
	}




	@Override
	public Persona listarId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Persona add(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Persona edit(Persona p) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Persona delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
