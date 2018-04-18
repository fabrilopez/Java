package com.fabricio.iua.dataaccess;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fabricio.iua.entities.Paciente;

@Repository("pacienteDao")
public class PacienteDaoImpl extends AbstractDao<Integer,Paciente> implements PacienteDao{
	
	@Autowired	
	private SessionFactory sessionFactory;
	
	@Override
	public Paciente getPaciente_id(long paciente_id) { 
		return (Paciente) sessionFactory.getCurrentSession().createCriteria(Paciente.class)
				.add(Expression.eq("Paciente_id", paciente_id))
				.setMaxResults(1)
				.uniqueResult();
	}
	
	@Override
	public void addNewPaciente(Paciente paciente) {
		sessionFactory.getCurrentSession().save(paciente);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> listPacientes(){
		Criteria criteria = createEntityCriteria();
		return (List<Paciente>) criteria.list();
	}
	
	@Override
	public void removePaciente(long paciente_id) {
		Paciente paciente = (Paciente) sessionFactory.getCurrentSession().load(Paciente.class, paciente_id);
		if(paciente!=null) {
			sessionFactory.getCurrentSession().delete(paciente);
		}
		
	}
	
	@Override
	public Paciente getPaciente(long dni) { 
		long lg = (long) sessionFactory.getCurrentSession().createQuery("SELECT p.Paciente_id FROM Paciente p WHERE p.Dni="+dni).uniqueResult();
		Paciente paciente =  (Paciente) sessionFactory.getCurrentSession().load(Paciente.class, lg);
		System.out.println("pacienteDao: paciente_id = "+lg+" "+paciente.getNombre());
		return paciente;
	}
}
