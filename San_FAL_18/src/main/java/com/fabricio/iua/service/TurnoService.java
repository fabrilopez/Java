package com.fabricio.iua.service;

import java.util.List;

import com.fabricio.iua.entities.Turno;

public interface TurnoService {
	public Turno findById(long turno_id);
	public void addTurno(Turno turno);
	public void updateTurno(Turno turno);
	public List<Turno> listTurnos();
	public void removeTurno(long turno_id);
}
