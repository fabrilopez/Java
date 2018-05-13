package com.fabricio.iua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sugerencias.html")
public class SugerenciasController {
	@RequestMapping(value = "/forms/sugerencias.html", method =RequestMethod.GET)
	public String showForm() {
		System.out.println("Metodo GET - SugerenciasController");
		return "sugerencias";
	}

}
