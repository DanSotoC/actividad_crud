package com.everis.formativa.Repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.formativa.Models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
	List<Persona> findAll();
	
}
