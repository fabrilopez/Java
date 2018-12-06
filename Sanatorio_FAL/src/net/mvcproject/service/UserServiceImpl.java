package net.mvcproject.service;

import java.util.HashMap;
import java.util.Map;

import net.mvcproject.dataaccess.UserDao;
import net.mvcproject.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	public UserServiceImpl() {
	}

	public Map<String,String> loginUser(String username, String password) throws Exception {
		
		User user = userDao.getUser(username, password);
		Map<String,String> result = null;
		if (user!=null) {
			result = new HashMap<String, String>();
			result.put("username", user.getUserName());
			result.put("password", user.getPassword());
			result.put("email", user.getEmail());
			result.put("name", user.getName());
			result.put("surname", user.getSurname());
		}
		
		return result;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUser(Map<String, String> userData) throws Exception {

		User user = new User();
		user.setUserName(userData.get("username"));
		user.setPassword(userData.get("password"));
		user.setEmail(userData.get("email"));
		user.setName(userData.get("name"));
		user.setSurname(userData.get("surname"));
		
		userDao.addNewUser(user);
		
	}
	
}
