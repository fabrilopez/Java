package com.fabricio.iua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fabricio.iua.dataaccess.TurnoDao;
import com.fabricio.iua.entities.Turno;

@Service("turnoService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class TurnoServiceImpl implements TurnoService{
	
	@Autowired
	private TurnoDao turnoDao;
	

	public TurnoServiceImpl() {
	}
	
	@Transactional
	public Turno findById(long turno_id) {
		return turnoDao.findById(turno_id);
	}
	
	@Transactional
	public void addTurno(Turno turno) {
		turnoDao.addTurno(turno);
	}
	
	@Transactional
	public void updateTurno(Turno turno) {
		Turno entity = turnoDao.findById(turno.getTurno_id());
		if(entity!=null) {
			entity.setFecha(turno.getFecha());
			entity.setTipo_practica(turno.getTipo_practica());
			entity.setIndicaciones(turno.getIndicaciones());
			entity.setDiagnostico(turno.getDiagnostico());
			entity.setProfesional_id(turno.getProfesional_id());
			entity.setPaciente_id(turno.getPaciente_id());
		}
	}
	
	@Transactional
	public List<Turno> listTurnos(){
		return turnoDao.listTurnos();
	}
	
	@Transactional
	public void removeTurno(long turno_id) {
		turnoDao.removeTurno(turno_id);
	}
}



















