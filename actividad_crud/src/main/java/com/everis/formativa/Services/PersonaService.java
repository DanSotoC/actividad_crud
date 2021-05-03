package com.everis.formativa.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.formativa.Models.Persona;
import com.everis.formativa.Repository.PersonaRepository;

public class PersonaService {

	@Autowired
	PersonaRepository personaRepo;

	public Persona guardarPersona(Persona persona) {
		return personaRepo.save(persona) ;
	}

	public List<Persona> allPersons() {
		return personaRepo.findAll();
	}

	public void deleteById(Long id) {
		personaRepo.deleteById(id);
	}

}
