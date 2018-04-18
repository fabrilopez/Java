package com.fabricio.iua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("contacto.html")

public class ContactoController {

	@RequestMapping(value = "/forms/contacto.html", method =RequestMethod.GET)
	public String showForm() {
		System.out.println("Metodo GET - ContactoController");
		return "contacto";
	}

}
