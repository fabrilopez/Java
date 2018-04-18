package com.fabricio.iua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fabricio.iua.dataaccess.PacienteDao;
import com.fabricio.iua.entities.Paciente;

@Service("pacienteService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PacienteServiceImpl implements PacienteService{
	
	@Autowired
	private PacienteDao pacienteDao;
	
	public PacienteServiceImpl(){
		 
	}
		
	@Transactional
	public Paciente findById(long paciente_id) {
		return pacienteDao.getPaciente_id(paciente_id);
	}
	
	@Transactional
	public void addPaciente(Paciente paciente) {
		pacienteDao.addNewPaciente(paciente);
	}
	
	@Transactional
	public List<Paciente> listPacientes(){
		return pacienteDao.listPacientes();
	}
	
	@Transactional
	public void removePaciente(long paciente_id) {
		pacienteDao.removePaciente(paciente_id);
	}
	
	@Transactional
	public Paciente getPaciente(long dni) {
		return pacienteDao.getPaciente(dni);
	}

}



















