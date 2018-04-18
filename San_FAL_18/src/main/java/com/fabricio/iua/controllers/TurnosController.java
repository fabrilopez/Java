package com.fabricio.iua.controllers;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fabricio.iua.entities.Especialidad;
import com.fabricio.iua.entities.Obrasocial;
import com.fabricio.iua.entities.Paciente;
import com.fabricio.iua.entities.Turno;
import com.fabricio.iua.entities.Profesional;
import com.fabricio.iua.repository.CombinedTables;
import com.fabricio.iua.service.EspecialidadService;
import com.fabricio.iua.service.ObrasocialService;
import com.fabricio.iua.service.PacienteService;
import com.fabricio.iua.service.ProfesionalService;
import com.fabricio.iua.service.TurnoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class TurnosController {
	
	static final Logger logger = LoggerFactory.getLogger(TurnosController.class); 
	
	@Autowired
	PacienteService pacienteService;
	
	@Autowired
	ObrasocialService obrasocialService;
	
	@Autowired
	EspecialidadService especialidadService;
	
	@Autowired
	ProfesionalService profesionalService;
	
	@Autowired
	TurnoService turnoService;

	/*
     * This method will provide the medium show the form
     */
	@RequestMapping(value = { "/turnos.html" }, method =RequestMethod.GET)
	public String showForm(ModelMap model) {
		CombinedTables combtab = new CombinedTables();			
		model.addAttribute("combtab", combtab);
		return "turnos";
	} 

	/*
     * This method will provide the medium to load data from paciente
     */

	@RequestMapping(value= {"/turnos.html"}, method=RequestMethod.POST)
	public String processForm(@Valid CombinedTables combtab, BindingResult result,  ModelMap model) {
		if(result.hasErrors()) {
			logger.info("Hay errores");
			return "turnos";	  
		}
		Paciente paciente = pacienteService.getPaciente(combtab.getPaciente().getDni());
		Obrasocial obrasocial = obrasocialService.getObrasocial(paciente.getOs_id());
		List<Especialidad> especialidades = especialidadService.listEspecialidades();
		List<Profesional> profesionales = profesionalService.listProfesionales();
		
		Turno turno = new Turno();
		combtab.setPaciente(paciente);
		combtab.setObrasocial(obrasocial);
		combtab.setEspecialidades(especialidades);
		combtab.setProfesionales(profesionales);
		combtab.setTurno(turno);
		model.addAttribute("combtab", combtab);
		return "newturno";
	} 
	
	@RequestMapping(value = { "/newturno.html" }, method =RequestMethod.GET)
	public String showFormnt(ModelMap model) {
		CombinedTables combtab = new CombinedTables();			
		model.addAttribute("combtab", combtab);
		return "newturno";
	}
	
	@RequestMapping(value = {"/newturno.html"}, method=RequestMethod.POST)
	public String processTurno(@Valid CombinedTables combtab, BindingResult result,  ModelMap model) {
		if(result.hasErrors()) {
			logger.info("Hay errores creando el turno");
			return "turnos";	  
		}		
		Date fecha = new Date();
		Turno turno = new Turno();			
		Paciente paciente = pacienteService.getPaciente(combtab.getPaciente().getDni());
		
		turno.setFecha(fecha);
		turno.setTipo_practica(combtab.getTurno().getTipo_practica());
		turno.setIndicaciones(" ");
		turno.setDiagnostico(" ");
		turno.setProfesional_id(combtab.getProfesional().getProfesional_id());
		turno.setPaciente_id(paciente.getPaciente_id());
		logger.info("Fecha: "+turno.getFecha());
		turnoService.addTurno(turno);
		model.addAttribute("success", "Turno creado exitosamente.");
		return "success";
	}	
	
}
