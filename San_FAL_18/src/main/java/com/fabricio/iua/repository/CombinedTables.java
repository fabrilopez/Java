package com.fabricio.iua.repository;

import java.util.ArrayList;
import java.util.List;

import com.fabricio.iua.entities.Especialidad;
import com.fabricio.iua.entities.Obrasocial;
import com.fabricio.iua.entities.Paciente;
import com.fabricio.iua.entities.Profesional;
import com.fabricio.iua.entities.Turno;

public class CombinedTables {
	
	private Especialidad especialidad = new Especialidad();
	private Obrasocial obrasocial = new Obrasocial();
	private Paciente paciente = new Paciente();
	private Profesional profesional = new Profesional();
	private Turno turno = new Turno();
	private List<Especialidad> especialidades = new ArrayList<Especialidad>();
	private List<Obrasocial> obrassociales = new ArrayList<Obrasocial>();  
	private List<Paciente> pacientes = new ArrayList<Paciente>();
	private List<Profesional> profesionales = new ArrayList<Profesional>();
	
	/**
	 * @return the especialidad
	 */
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	/**
	 * @return the obrasocial
	 */
	public Obrasocial getObrasocial() {
		return obrasocial;
	}
	/**
	 * @param obrasocial the obrasocial to set
	 */
	public void setObrasocial(Obrasocial obrasocial) {
		this.obrasocial = obrasocial;
	}
	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}
	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	/**
	 * @return the profesional
	 */
	public Profesional getProfesional() {
		return profesional;
	}
	/**
	 * @param profesional the profesional to set
	 */
	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}
	/**
	 * @return the turno
	 */
	public Turno getTurno() {
		return turno;
	}
	/**
	 * @param turno the turno to set
	 */
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	/**
	 * @return the especialidades
	 */
	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}
	/**
	 * @param especialidades the especialidades to set
	 */
	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}
	/**
	 * @return the obrassocialies
	 */
	public List<Obrasocial> getObrassociales() {
		return obrassociales;
	}
	/**
	 * @param obrassocialies the obrassocialies to set
	 */
	public void setObrassociales(List<Obrasocial> obrassociales) {
		this.obrassociales = obrassociales;
	}
	/**
	 * @return the pacientes
	 */
	public List<Paciente> getPacientes() {
		return pacientes;
	}
	/**
	 * @param pacientes the pacientes to set
	 */
	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	/**
	 * @return the profesionales
	 */
	public List<Profesional> getProfesionales() {
		return profesionales;
	}
	/**
	 * @param profesionales the profesionales to set
	 */
	public void setProfesionales(List<Profesional> profesionales) {
		this.profesionales = profesionales;
	}
	
	

}
