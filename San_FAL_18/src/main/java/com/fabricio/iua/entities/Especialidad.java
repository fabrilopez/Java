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
@Table(name="especialidad")
public class Especialidad {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Especialidad_id; 
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name="nombre", nullable = false, length=50)
	private String Nombre;

	public long getEspecialidad_id() {
		return Especialidad_id;
	}

	public void setEspecialidad_id(long especialidad_id) {
		this.Especialidad_id = especialidad_id;
	}
  
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
}
