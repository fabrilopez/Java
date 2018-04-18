package com.fabricio.iua.dataaccess;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fabricio.iua.entities.Profesional;

@Repository("profesionalDao")
public class ProfesionalDaoImpl extends AbstractDao<Integer, Profesional> implements ProfesionalDao{
	
	@Autowired	
	private SessionFactory sessionFactory;	

	@Override
	public Profesional findById(long profesional_id) {
		return getByKey((int) profesional_id);		
	}
	
	@Override
	public void addProfesional(Profesional profesional) {
		sessionFactory.getCurrentSession().save(profesional);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Profesional> listProfesionales(){
		Criteria criteria = createEntityCriteria();
		return (List<Profesional>) criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Profesional> listProfesionalescon(long especialidad_id){
		Criteria criteria = (Criteria) createEntityCriteria()
				.add(Expression.eq("especialidad_id", especialidad_id))
				.setMaxResults(1)
				.uniqueResult();
		return (List<Profesional>) criteria.list();
	}
	
	@Override
	public void removeProfesional(long profesional_id) {
		Profesional profesional = (Profesional) sessionFactory.getCurrentSession().load(Profesional.class, profesional_id);
		if(null!=profesional) {
			sessionFactory.getCurrentSession().delete(profesional);
		}
		
	}
	
	
}
