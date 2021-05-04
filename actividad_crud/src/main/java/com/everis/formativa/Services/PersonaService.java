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
	PersonaRepository personaRepository;

	public Persona guardarPersona(Persona persona) {
		return personaRepository.save(persona);
	}

	public List<Persona> allPersons() {
		return personaRepository.findAll();
	}

	public void deleteById(Long id) {
		personaRepository.deleteById(id);
	}

	public Optional<Persona> findById(Long id) {
		Optional<Persona> person = personaRepository.findById(id);
		return person;
	}

}
