package com.fabricio.iua.service;

import java.util.List;

import com.fabricio.iua.entities.Profesional;

public interface ProfesionalService {
	Profesional findById(long profesional_id);
	public void addProfesional(Profesional profesional);
	public void updateProfesional(Profesional profesional);
	public List<Profesional> listProfesionales();
	public List<Profesional> listProfesionalescon(long especialidad_id);
	public void removeProfesional(long profesional_id);
}
