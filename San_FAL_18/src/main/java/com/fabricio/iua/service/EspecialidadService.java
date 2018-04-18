package com.fabricio.iua.service;

import java.util.List;

import com.fabricio.iua.entities.Especialidad;

public interface EspecialidadService {
	Especialidad findById(long especialidad_id);
	public void addEspecialidad(Especialidad especialidad);
	public void updateEspecialidad(Especialidad especialidad);
	List<Especialidad> listEspecialidades();
	public void removeEspecialidad(long especialidad_id);
}
