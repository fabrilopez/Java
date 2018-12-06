package net.mvcproject.dataaccess;

import net.mvcproject.entities.User;

public interface UserDao {

	public User getUser(String username, String password);
	
	public void addNewUser(User user);
}
