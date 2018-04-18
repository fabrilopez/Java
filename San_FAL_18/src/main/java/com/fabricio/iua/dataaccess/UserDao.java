package com.fabricio.iua.dataaccess;

import com.fabricio.iua.entities.User;

public interface UserDao {

	public User getUser(String username, String password);
	
	public void addNewUser(User user);
}
