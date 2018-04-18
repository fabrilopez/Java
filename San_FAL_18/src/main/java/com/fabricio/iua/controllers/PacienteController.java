package com.fabricio.iua.controllers;

import java.util.List;

import javax.validation.Valid;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fabricio.iua.entities.Obrasocial;
import com.fabricio.iua.entities.Paciente;
import com.fabricio.iua.service.ObrasocialService;
import com.fabricio.iua.service.PacienteService;

@Controller
public class PacienteController {
	
static final Logger logger = LoggerFactory.getLogger(PacienteController.class); 
	
	@Autowired
	PacienteService pacienteService;
	
	@Autowired
	ObrasocialService obrasocialService;
	
 
	/*
     * This method will provide the medium to add a new paciente.
     */
    @RequestMapping (value = { "/newpaciente.html" }, method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		Paciente paciente = new Paciente();
		List<Obrasocial> obrassociales = obrasocialService.listObrassociales();
		
		model.addAttribute("paciente", paciente);
		model.addAttribute("obrassociales", obrassociales);
		model.addAttribute("edit", false);		
		return "newpaciente";
	}


    /*
     * This method will be called on form submission, handling POST request for
     * saving paciente in database. It also validates the user input
     * 
    */ 
    @RequestMapping(value = { "/newpaciente.html" }, method = RequestMethod.POST)
    public String savePaciente(@Valid Paciente paciente, BindingResult result, ModelMap model) {
    	if(result.hasErrors()) {
			logger.info("Hay errores creando el paciente");
			return "turnos";	  
		}
    	pacienteService.addPaciente(paciente);
    	model.addAttribute("success", "Paciente creado exitosamente.");
    	return "success";
    }
    
	
}
