package com.fabricio.iua.dataaccess;

import java.util.List;

import com.fabricio.iua.entities.Turno;

public interface TurnoDao {
	
	public Turno findById(long turno_id);
	public void addTurno(Turno turno);
	List<Turno> listTurnos();
	public void removeTurno(long turno_id);
}
