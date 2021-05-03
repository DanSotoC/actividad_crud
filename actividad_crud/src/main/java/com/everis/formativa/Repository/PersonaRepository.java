package com.everis.formativa.Repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.formativa.Models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	List<Persona> findAll();
	void saveAll(@Valid Persona persona);
}
