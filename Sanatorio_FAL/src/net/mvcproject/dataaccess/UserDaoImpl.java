package net.mvcproject.dataaccess;

import java.util.Date;

import net.mvcproject.entities.User;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUser(String username, String password) {

		return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
		.add(Expression.eq("userName", username))
		.add(Expression.eq("password", password))
		.setMaxResults(1)
		.uniqueResult();
	}

	@Override
	public void addNewUser(User user) {
		user.setAddedDate(new Date());
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	
}
