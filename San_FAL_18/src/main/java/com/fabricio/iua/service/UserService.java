package com.fabricio.iua.service;

import java.util.Map;

public interface UserService {
	public Map<String,String> loginUser(String user, String password) throws Exception;
	public void addUser(Map<String, String> userData) throws Exception;
}	
