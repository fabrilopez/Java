package com.fabricio.iua.dataaccess;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fabricio.iua.entities.Obrasocial;

@Repository("obrasocialDao")
public class ObrasocialDaoImpl extends AbstractDao<Integer,Obrasocial> implements ObrasocialDao{

	@Autowired	
	private SessionFactory sessionFactory;	
	
	@Override
	public Obrasocial findById(long os_id) {
		Obrasocial obrasocial = (Obrasocial) sessionFactory.getCurrentSession().load(Obrasocial.class, os_id);
		return obrasocial;
	}
		
	@Override
	public void addObrasocial(Obrasocial obrasocial) {
		sessionFactory.getCurrentSession().save(obrasocial);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Obrasocial> listObrassociales(){
		Criteria criteria = createEntityCriteria();
		 return (List<Obrasocial>) criteria.list();
	}
	
	@Override
	public void removeObrasocial(long os_id) {
		Obrasocial obrasocial = (Obrasocial) sessionFactory.getCurrentSession().load(Obrasocial.class, os_id);
		if(obrasocial!=null) {
			sessionFactory.getCurrentSession().delete(obrasocial);
		}
	}
	
	@Override
	public String getNombre(long os_id) {
		String st = (String) sessionFactory.getCurrentSession().createQuery("SELECT p.Nombre FROM Obrasocial p WHERE p.Os_id="+os_id).uniqueResult();
		System.out.println("ObrasocialDao: Nombre con os_id="+os_id+" = " + st);		
		return st;
	}
	
	@Override
	public Obrasocial getObrasocial(long os_id) {
		Obrasocial obrasocial = (Obrasocial) sessionFactory.getCurrentSession().load(Obrasocial.class, os_id);
		System.out.println("obrasocialDao: "+obrasocial.getNombre());
		return obrasocial;
	}
}
