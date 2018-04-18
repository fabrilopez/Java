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
@Table(name="obrasocial")
public class Obrasocial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Os_id;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name="nombre", nullable = false, length=50)
	private String Nombre;

	public long getOs_id() {
		return Os_id;
	}

	public void setOs_id(long os_id) {
		this.Os_id = os_id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	
}
