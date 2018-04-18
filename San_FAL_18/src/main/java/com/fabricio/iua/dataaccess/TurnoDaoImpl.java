package com.fabricio.iua.dataaccess;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fabricio.iua.entities.Turno;

@Repository("turnodDao")
public class TurnoDaoImpl extends AbstractDao<Integer,Turno> implements TurnoDao {

	@Autowired	
	private SessionFactory sessionFactory;
	
	@Override
	public Turno findById(long turno_id) {
		return getByKey((int) turno_id);
	}
	
	@Override
	public void addTurno(Turno turno) {
		sessionFactory.getCurrentSession().save(turno);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Turno> listTurnos(){
		Criteria criteria = createEntityCriteria();
		return (List<Turno>) criteria.list();
	}
	
	@Override
	public void removeTurno(long turno_id) {
		Turno turno = (Turno) sessionFactory.getCurrentSession().load(Turno.class, turno_id);
		if(turno!=null) {
			sessionFactory.getCurrentSession().delete(turno);
		}
	}
}


















