package com.fabricio.iua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fabricio.iua.dataaccess.ProfesionalDao;
import com.fabricio.iua.entities.Profesional;

@Service("profesionalService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProfesionalServiceImpl implements ProfesionalService{

	@Autowired
	private ProfesionalDao profesionalDao;
	
	public ProfesionalServiceImpl() {	
	}
	
	@Transactional
	public Profesional findById(long profesional_id) {
		return profesionalDao.findById(profesional_id);
	}
	
	@Transactional
	public void addProfesional(Profesional profesional) {
		profesionalDao.addProfesional(profesional);
	}
	
	@Transactional
	public void updateProfesional(Profesional profesional) {
		Profesional entity = profesionalDao.findById(profesional.getProfesional_id());
		if(entity!=null) {
			entity.setNombre(profesional.getNombre());
			entity.setApellido(profesional.getApellido());
			entity.setEmail(profesional.getEmail());
			entity.setProfesional_id(profesional.getEspecialidad_id());
		}
	}
	
	@Transactional
	public List<Profesional> listProfesionales(){
		return profesionalDao.listProfesionales();
	}
	
	@Transactional
	public List<Profesional> listProfesionalescon(long especialidad_id){
		return profesionalDao.listProfesionalescon(especialidad_id);
	}
	
	@Transactional
	public void removeProfesional(long profesional_id) {
		profesionalDao.removeProfesional(profesional_id);
	}
	
}

















