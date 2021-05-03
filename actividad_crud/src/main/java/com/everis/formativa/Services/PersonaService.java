package com.everis.formativa.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.formativa.Models.Persona;
import com.everis.formativa.Repository.PersonaRepository;

@Service
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

	public Optional<Persona> findById(Long id) {
		Optional<Persona> person = personaRepo.findById(id);
		return person;
	}

}
