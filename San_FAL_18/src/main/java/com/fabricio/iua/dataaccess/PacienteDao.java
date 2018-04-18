package com.fabricio.iua.dataaccess;

import java.util.List;

import com.fabricio.iua.entities.Paciente;

public interface PacienteDao {

	public Paciente getPaciente_id(long paciente_id);
	
	public void addNewPaciente(Paciente paciente);
	
	public List<Paciente> listPacientes();
	
	public void removePaciente(long paciente_id);
	
	public Paciente getPaciente(long dni);
}
