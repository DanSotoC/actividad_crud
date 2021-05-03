package com.everis.formativa.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.everis.formativa.Models.Persona;
import com.everis.formativa.Services.PersonaService;

@RestController
public class ApiController {
	
	@Autowired
	PersonaService personaService;
	
	@RequestMapping("/api/persona")
	public  List<Persona> listaPersona(){
		
		List<Persona> lista_persona = personaService.allPersonas();
		return lista_persona;
	}
	
	@RequestMapping("/api/persona/{id}")
	public Optional<Persona> buscarPersona(@PathVariable("id") Long id) {
		
		Optional<Persona> persona = personaService.findById(id);
		return persona;
	}
	
	@RequestMapping("/api/persona/eliminar/{id}")
	public String eliminarAlumno(@PathVariable("id") Long id) {
	
		personaService.deleteById(id);
		return "Persona eliminado";
	}
	
	
	
	

}
