package com.fabricio.iua.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="profesional")
public class Profesional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Profesional_id;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name="nombre", nullable = false, length=50)
	private String Nombre;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name="apellido", nullable = false, length=50)
	private String Apellido;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name="email", nullable = false, length=50)
	private String Email;
	
	@NotNull
	@Column(name="especialidad_id", nullable = false, length=20)
	private long Especialidad_id;

	public long getProfesional_id() {
		return Profesional_id;
	}

	public void setProfesional_id(long profesional_id) {
		this.Profesional_id = profesional_id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getEspecialidad_id() {
		return Especialidad_id;
	}

	public void setEspecialidad_id(long especialidad_id) {
		this.Especialidad_id = especialidad_id;
	}
	
	

	
	
}
