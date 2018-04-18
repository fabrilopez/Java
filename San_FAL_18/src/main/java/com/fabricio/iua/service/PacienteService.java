package com.fabricio.iua.service;

import java.util.List;
//import java.util.Map;

import com.fabricio.iua.entities.Paciente;

public interface PacienteService {
	public Paciente findById(long paciente_id);
	public void addPaciente(Paciente paciente);
	public List<Paciente> listPacientes();
	public void removePaciente(long paciente_id);
	public Paciente getPaciente(long dni);	
}
