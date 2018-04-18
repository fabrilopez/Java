package com.fabricio.iua.dataaccess;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fabricio.iua.entities.Especialidad;

@Repository("especialidadDao")
public class EspecialidadDaoImpl extends AbstractDao<Integer, Especialidad> implements EspecialidadDao{
	
	@Autowired	
	private SessionFactory sessionFactory;	
	
	@Override
	public Especialidad findById(long especialidad_id) {
		Especialidad especialidad = (Especialidad) sessionFactory.getCurrentSession().load(Especialidad.class, especialidad_id);
		return especialidad;
	}
	
	@Override
	public void addEspecialidad(Especialidad especialidad) {
		sessionFactory.getCurrentSession().save(especialidad);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Especialidad> listEspecialidades(){
		Criteria criteria = createEntityCriteria();
        return (List<Especialidad>) criteria.list();		
	}
	
	@Override
	public void removeEspecialidad(long especialidad_id) {
		Especialidad especialidad = (Especialidad) sessionFactory.getCurrentSession().load(Especialidad.class, especialidad_id);
		if(null!=especialidad) {
			sessionFactory.getCurrentSession().delete(especialidad);
		}
	}
}
