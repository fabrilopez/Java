package com.fabricio.iua.service;

import java.util.List;

import com.fabricio.iua.entities.Obrasocial;

public interface ObrasocialService {
	Obrasocial findById (long os_id);
	public void addObrasocial(Obrasocial obrasocial);
	public void updateObrasocial(Obrasocial obrasocial);
	List<Obrasocial> listObrassociales();
	public void removeObrasocial(long os_id);
	public String getNombre(long os_id);
	public Obrasocial getObrasocial(long os_id);
}
