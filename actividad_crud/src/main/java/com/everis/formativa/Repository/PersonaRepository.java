package com.everis.formativa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.formativa.Models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
