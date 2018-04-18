package com.fabricio.iua.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fabricio.iua.entities.Especialidad;
import com.fabricio.iua.entities.Profesional;
import com.fabricio.iua.service.EspecialidadService;
import com.fabricio.iua.service.ProfesionalService;

@Controller
public class ProfesionalesController {
	
	@Autowired      
	EspecialidadService especialidadService;
	
	@Autowired
	ProfesionalService profesionalService;

	/*
     * This method will list all existing especialidades y profesionales.
     */
	@RequestMapping(value = { "/profesionales.html" }, method =RequestMethod.GET)
	public String showForm(ModelMap model) {
		List<Especialidad> especialidades = especialidadService.listEspecialidades();
		List<Profesional> profesionales = profesionalService.listProfesionales();
        model.addAttribute("especialidades", especialidades);
        model.addAttribute("profesionales", profesionales);
		return "profesionales";
	}
	
	/*
     * This method will provide the medium to add a new especialidad.
     */
    @RequestMapping(value = { "/newespecialidad.html" }, method = RequestMethod.GET)
    public String newEspecialidad(ModelMap model) {
        Especialidad especialidad = new Especialidad();
        model.addAttribute("especialidad", especialidad);
        model.addAttribute("edit", false);
        return "newespecialidad";
    }
    
    /*
     * This method will provide the medium to add a new profesional.
     */
    @RequestMapping(value = { "/newprofesional.html" }, method = RequestMethod.GET)
    public String newProfesional(ModelMap model) {
    	List<Especialidad> especialidades = especialidadService.listEspecialidades();
        Profesional profesional = new Profesional();
        model.addAttribute("profesional", profesional);
        model.addAttribute("especialidades", especialidades);
        model.addAttribute("edit", false);
        return "newprofesional";
    }
	
    /*
     * This method will be called on form submission, handling POST request for
     * saving especialidad in database. It also validates the user input
     * 
     */
    @RequestMapping(value = { "/newespecialidad.html" }, method = RequestMethod.POST)
    public String saveEspecialidad(@Valid Especialidad especialidad, BindingResult result, ModelMap model ) {
    	if(result.hasErrors()) {
    		return "profesionales";
    	}
    	especialidadService.addEspecialidad(especialidad);
    	model.addAttribute("success", "Especialidad " + especialidad.getNombre() + " registrada exitosamente!");
    	
    	return "success";
    }    
    
    /*
     * This method will be called on form submission, handling POST request for
     * saving profesional in database. It also validates the user input
     * 
     */
    @RequestMapping(value = { "/newprofesional.html" }, method = RequestMethod.POST)
    public String saveProfesional(@Valid Profesional profesional, BindingResult result, ModelMap model ) {    	
    	
    	if(result.hasErrors()) {
    		return "profesionales";
    	}
    	profesionalService.addProfesional(profesional);
       	model.addAttribute("success", "Profesional " + profesional.getNombre() + " registrado exitosamente!");    	
       	return "success";		    		
    }
    
    /*
     * This method will delete an especialidad by it's especialidad_id value.
     */
    @RequestMapping(value = { "/delete-{especialidad_id}-especialidad" }, method = RequestMethod.GET)
    public String deleteEspecialidad(@PathVariable String especialidad_id) {
    	long l = Long.parseLong(especialidad_id);
    	especialidadService.removeEspecialidad(l);
    	return "redirect:/forms/profesionales.html";
    }
    
    /*
     * This method will delete an profesional by it's especialidad_id value.
     */
    @RequestMapping(value = { "/delete-{profesional_id}-profesional" }, method = RequestMethod.GET)
    public String deleteProfesional(@PathVariable String profesional_id) {
    	long l = Long.parseLong(profesional_id);
    	profesionalService.removeProfesional(l);
    	return "redirect:/forms/profesionales.html";
    }
    
  
}
