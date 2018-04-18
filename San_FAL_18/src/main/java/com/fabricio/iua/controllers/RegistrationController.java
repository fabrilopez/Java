package com.fabricio.iua.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import com.fabricio.iua.form.Registration;
import com.fabricio.iua.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registrationform.html")
public class RegistrationController {
	
	@Autowired
	private RegistrationValidation registrationValidation;

	@Autowired
	UserService userService;
	
	public void setRegistrationValidation(
			RegistrationValidation registrationValidation) {
		this.registrationValidation = registrationValidation;
	}

	// Display the form on the get request
	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.GET)
	public String showRegistration(@SuppressWarnings("rawtypes") Map model) {
		Registration registration = new Registration();
		model.put("registration", registration);
		return "registrationform";
	}

	// Process the form.
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@Valid Registration registration,
			BindingResult result) {
		// set custom Validation by user
		registrationValidation.validate(registration, result);
		if (result.hasErrors()) {
			return "registrationform";
		}
		
		Map<String,String> userData = new HashMap<String, String>();
		userData.put("username", registration.getUserName());
		userData.put("password", registration.getPassword());
		userData.put("email", registration.getEmail());
		userData.put("name", registration.getName());
		userData.put("surname", registration.getSurname());
		
		try {
			
			userService.addUser(userData);
		} catch (Exception e) {
			e.printStackTrace();
			result.rejectValue("generalErrors",
			"user.registration.general.error",
					e.getMessage());
			
			return "registrationform";
		}
		
		
		
		
		
		return "registrationsuccess";
	}
}
