package com.everis.formativa.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.formativa.Models.Persona;
import com.everis.formativa.Services.PersonaService;
import com.everis.formativa.Util.Validacion;



@Controller
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
	@RequestMapping("/personas")
	public String personas(@RequestParam(value ="nombre") String nombre,
			@RequestParam(value ="apellido") String apellido,
			@RequestParam(value ="rut") String rut,
			@RequestParam(value ="email") String email){
		Persona person =  new Persona();
		person.setNombre(nombre);
		if(Validacion.validarRut(rut)) {
			person.setRut(rut);
		}
		else {
			person.setRut("");
		}
		person.setApellido(apellido);
		person.setEmail(email);
		person = personaService.guardarPersona(person);
		return "redirect:/";
	}
	@RequestMapping("/tabla_personas")
	public String tablaPersonas(Model modelo){
		ArrayList<Persona> personList = new ArrayList<Persona>();
		personList = (ArrayList<Persona>)personaService.allPersons();
		int largo = personList.size();
		modelo.addAttribute("personList",personList);
		modelo.addAttribute("largo",largo);
		return "PersonaList.jsp";
	}
	
	@RequestMapping("/personas/eliminar/{id}}")
	public String eliminarPersona(@PathVariable("id") Long id){
		personaService.deleteById(id);
		return "redirect:/tabla_personas";
	}
	@RequestMapping("/personas/editar/{id}")
	public String editPersona(@PathVariable("id") Long id){
			return "";
	}
}
