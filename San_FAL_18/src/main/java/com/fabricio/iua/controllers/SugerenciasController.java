package com.fabricio.iua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sugerencias.html")
public class SugerenciasController {
	
	
	
	/*
	 * Este método muestra el formulario sugerencias
	 */
	
	@RequestMapping(value = "/forms/sugerencias.html", method =RequestMethod.GET)
	public String showForm() {
		System.out.println("Metodo GET - SugerenciasController");
		return "sugerencias";
	}
	
	
	/*
	 este metodo recibe datos del formulario y los envía por correo
	 */
	
	@RequestMapping(value = { "/sugerencias.html" }, method = RequestMethod.POST)
	public String enviarMensje(Model model,@ModelAttribute("name") String Name, @ModelAttribute("telefono") long Tel,
			@ModelAttribute("email") String Email, @ModelAttribute("mensaje") String Mensaje) {				
		
		//rutina de envio de correo electrónico (borrada)
	
		
		model.addAttribute("success", "El mensaje de "+ Name + " ha sido enviado, gracias por su consulta!");
		System.out.println("Metodo POST - SugerenciasController");
		return "success";
	}

}
