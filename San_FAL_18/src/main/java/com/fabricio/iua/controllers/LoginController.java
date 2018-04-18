package com.fabricio.iua.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import java.util.Map;
import javax.validation.Valid;

import com.fabricio.iua.form.LoginForm;
import com.fabricio.iua.service.UserService;

@Controller
//@RequestMapping("loginform.html")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "/loginform.html" }, method = RequestMethod.GET)
	public String showForm(@SuppressWarnings("rawtypes") Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "/loginform.html" }, method = RequestMethod.POST)
	public String processForm(@Valid LoginForm loginForm, BindingResult result,
			@SuppressWarnings("rawtypes") Map model) {
		if (result.hasErrors()) {
			return "loginform";
		}
		loginForm = (LoginForm) model.get("loginForm");


		try {
			Map<String, String> userData = userService.loginUser(loginForm.getUserName(), loginForm.getPassword());
			if (userData!=null) {
				loginForm.setUserName(userData.get("username"));
				loginForm.setPassword(userData.get("password"));
				loginForm.setEmail(userData.get("email"));
				loginForm.setName(userData.get("name"));
				loginForm.setSurname(userData.get("surname"));
				model.put("loginForm", loginForm);
				return "loginsuccess";				
			}
			else {
				result.rejectValue("generalErrors",
						"user.registration.general.error",
								"Usuario y/o password incorrectos.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.rejectValue("generalErrors",
					"user.registration.general.error",
							e.getMessage());
		}		
		
		return "loginform";
		
	}

}
