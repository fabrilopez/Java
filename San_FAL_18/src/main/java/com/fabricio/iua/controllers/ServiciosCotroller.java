package com.fabricio.iua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("servicios.html")
public class ServiciosCotroller {
	@RequestMapping(value = "/forms/servicios.html", method =RequestMethod.GET)
	public String showForm() {
		System.out.println("Metodo GET - ServiciosController");
		return "servicios";
	}

}
