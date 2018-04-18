package com.fabricio.iua.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Paciente_id;
	
	@Column(name = "dni", nullable = false, length=20)
	private long Dni;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name = "nombre", nullable = false, length=50)
	private String Nombre;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name = "apellido", nullable = false, length=50)
	private String Apellido;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name = "email", nullable = false, length=50)
	private String Email;
	
	@Column(name = "telefono", nullable = false, length=20)
	private long Telefono;
	
	@NotNull
	@Size(min=1, max=50)
	@Column(name = "direccion", nullable = false, length=50)
	private String Direccion;
	
	@Column(name = "os_id", nullable = false, length=20)
	private long Os_id;
	
	public long getPaciente_id() {
		return Paciente_id;
	}

	public void setPaciente_id(long paciente_id) {
		this.Paciente_id = paciente_id;
	}
	
	public long getDni() {
		return Dni;
	}

	public void setDni(long dni) {
		this.Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public long getTelefono() {
		return Telefono;
	}

	public void setTelefono(long telefono) {
		this.Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}
	
	public long getOs_id() {
		return Os_id;
	}

	public void setOs_id(long os_id) {
		this.Os_id = os_id;
	}

}
