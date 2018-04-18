package com.fabricio.iua.dataaccess;

import java.util.List;

import com.fabricio.iua.entities.Especialidad;

public interface EspecialidadDao {
	
	public Especialidad findById(long especialidad_id);
	public void addEspecialidad(Especialidad especialidad);
	List<Especialidad> listEspecialidades();
	public void removeEspecialidad(long especialidad_id);
	
}
