package com.everis.formativa.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idPersona;
	
	String rut;
	
	@Size(min=3, max=20)
	String nombre;
	
	@Size(min=3, max=20)
	String apellido;
	
	@Size(min=10)
	String email;
	
	public Persona() {
	}

	public Persona(String rut, @Size(min = 3, max = 20) String nombre, @Size(min = 3, max = 20) String apellido,
			@Size(min = 10) String email) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
