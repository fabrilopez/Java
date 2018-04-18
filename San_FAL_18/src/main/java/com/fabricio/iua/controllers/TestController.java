package com.fabricio.iua.controllers;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fabricio.iua.entities.Especialidad;
import com.fabricio.iua.entities.Obrasocial;
import com.fabricio.iua.entities.Paciente;
import com.fabricio.iua.entities.Profesional;
import com.fabricio.iua.repository.CombinedTables;
import com.fabricio.iua.service.EspecialidadService;
import com.fabricio.iua.service.ObrasocialService;
import com.fabricio.iua.service.PacienteService;
import com.fabricio.iua.service.ProfesionalService;

@Controller
public class TestController {
	static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	PacienteService pacienteService;
	
	@Autowired
	ObrasocialService obrasocialService;
	
	@Autowired
	EspecialidadService especialidadService;
	
	@Autowired
	ProfesionalService profesionalService;
	
	@RequestMapping(value = { "/test.html" }, method =RequestMethod.GET)
	public String showForm(ModelMap model) {
		CombinedTables combtab = new CombinedTables();
		List<Especialidad> especialidades = especialidadService.listEspecialidades();
		List<Obrasocial> obrassociales = obrasocialService.listObrassociales();
		List<Paciente> pacientes = pacienteService.listPacientes();
		List<Profesional> profesionales = profesionalService.listProfesionales();
			
		combtab.setEspecialidades(especialidades);
		combtab.setObrassociales(obrassociales);
		combtab.setPacientes(pacientes);
		combtab.setProfesionales(profesionales);
		
		model.addAttribute("combtab", combtab);
		return "test";
	}
		
}



	

