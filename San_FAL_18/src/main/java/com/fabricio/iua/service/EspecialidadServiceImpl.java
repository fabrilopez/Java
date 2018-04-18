package com.fabricio.iua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fabricio.iua.dataaccess.EspecialidadDao;
import com.fabricio.iua.entities.Especialidad;

@Service("especialidadService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EspecialidadServiceImpl implements EspecialidadService{

	@Autowired
	private EspecialidadDao especialidadDao;
	
	public EspecialidadServiceImpl() {
	}

	@Transactional
	public Especialidad findById(long especialidad_id) {
		return especialidadDao.findById(especialidad_id);
	}
	
	
	@Transactional
	public void addEspecialidad(Especialidad especialidad) {
		especialidadDao.addEspecialidad(especialidad);
	}
	
	@Transactional
	public void updateEspecialidad(Especialidad especialidad) {
		Especialidad entity = especialidadDao.findById(especialidad.getEspecialidad_id());
		if(entity!=null) {
			entity.setNombre(especialidad.getNombre());
		}
	}
	
	@Transactional
	public List<Especialidad> listEspecialidades(){
		return especialidadDao.listEspecialidades();
	}
	
	@Transactional
	public void removeEspecialidad(long especialidad_id) {
		especialidadDao.removeEspecialidad(especialidad_id);
	}
	
}
