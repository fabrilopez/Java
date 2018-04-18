package com.fabricio.iua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fabricio.iua.dataaccess.ObrasocialDao;
import com.fabricio.iua.entities.Obrasocial;

@Service("obrasocialService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ObrasocialServiceImpl implements ObrasocialService{

	@Autowired 
	private ObrasocialDao obrasocialDao;
	
	public ObrasocialServiceImpl() {
		
	}
	
	@Transactional
	public Obrasocial findById (long os_id) {
		return obrasocialDao.findById(os_id);
	}
	
	@Transactional
	public void addObrasocial(Obrasocial obrasocial) {
		obrasocialDao.addObrasocial(obrasocial);
	}
	
	@Transactional
	public void updateObrasocial(Obrasocial obrasocial) {
		Obrasocial entity = obrasocialDao.findById(obrasocial.getOs_id());
		if(entity!=null) {
			entity.setNombre(obrasocial.getNombre());
		}
	}
	
	@Transactional
	public List<Obrasocial> listObrassociales(){
		return obrasocialDao.listObrassociales();
	}
	
	@Transactional
	public void removeObrasocial(long os_id) {
		obrasocialDao.removeObrasocial(os_id);
	}
	
	@Transactional
	public String getNombre(long os_id) {
		return obrasocialDao.getNombre(os_id);
	}
	@Transactional
	public Obrasocial getObrasocial(long os_id) {
		return obrasocialDao.getObrasocial(os_id);
	}
	
}
