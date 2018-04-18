package com.fabricio.iua.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="turno")
public class Turno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Turno_id;
	
	@Column(name = "fecha")
	private Date Fecha;
	
	@Column(name="tipo_practica", nullable = false, length=50)
	private String Tipo_practica;
	
	@Column(name="indicaciones", nullable = false, length=50)
	private String Indicaciones;
	
	@Column(name="diagnostico", nullable = false, length=50)
	private String Diagnostico;
	
	@Column(name="profesional_id", nullable = false, length=20)
	private long Profesional_id;
	
	@Column(name="paciente_id", nullable = false, length=20)
	private long Paciente_id;

	public long getTurno_id() {
		return Turno_id;
	}

	public void setTurno_id(long turno_id) {
		this.Turno_id = turno_id;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		this.Fecha = fecha;
	}

	public String getTipo_practica() {
		return Tipo_practica;
	}

	public void setTipo_practica(String tipo_practica) {
		this.Tipo_practica = tipo_practica;
	}

	public String getIndicaciones() {
		return Indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.Indicaciones = indicaciones;
	}

	public String getDiagnostico() {
		return Diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.Diagnostico = diagnostico;
	}

	public long getProfesional_id() {
		return Profesional_id;
	}

	public void setProfesional_id(long profesional_id) {
		this.Profesional_id = profesional_id;
	}

	public long getPaciente_id() {
		return Paciente_id;
	}

	public void setPaciente_id(long paciente_id) {
		Paciente_id = paciente_id;
	}
	
	
	
}
