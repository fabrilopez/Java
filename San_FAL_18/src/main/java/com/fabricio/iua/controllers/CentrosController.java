package com.fabricio.iua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("centros.html")
public class CentrosController {
	@RequestMapping(value = "/forms/centros.html", method =RequestMethod.GET)
	public String showForm() {
		System.out.println("Metodo GET - CentrosController");
		return "centros";
	}

}
