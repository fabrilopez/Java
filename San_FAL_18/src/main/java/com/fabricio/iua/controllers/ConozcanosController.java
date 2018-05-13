package com.fabricio.iua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("conozcanos.html")

public class ConozcanosController {
	
	@RequestMapping(value = "/forms/conozcanos.html", method =RequestMethod.GET)
	public String showForm() {
		System.out.println("Metodo GET - ConozcanosController");
		return "conozcanos";
	}

}
