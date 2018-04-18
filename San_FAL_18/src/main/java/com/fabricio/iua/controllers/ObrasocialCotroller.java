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

import com.fabricio.iua.entities.Obrasocial;
import com.fabricio.iua.service.ObrasocialService;

@Controller
public class ObrasocialCotroller {
	
	@Autowired
	ObrasocialService obrasocialService;	

	/*
     * This method will list all existing obras sociales
     */
	@RequestMapping(value = { "/obras.html" }, method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		List<Obrasocial> obrassociales = obrasocialService.listObrassociales();
		model.addAttribute("obrassociales", obrassociales);
		return "obras";
	}
	
	/*
     * This method will provide the medium to add a new obra social.
     */
    @RequestMapping(value = { "/newobrasocial.html" }, method = RequestMethod.GET)
    public String newObrasocial(ModelMap model) {
    	Obrasocial obrasocial = new Obrasocial();
    	model.addAttribute("obrasocial", obrasocial);
    	model.addAttribute("edit", false);
        return "newobrasocial";
    }
    
    /*
     * This method will be called on form submission, handling POST request for
     * saving obra social in database. It also validates the user input
     * 
     */
    @RequestMapping(value = { "/newobrasocial.html" }, method = RequestMethod.POST)
    public String saveObrasocial(@Valid Obrasocial obrasocial, BindingResult result, ModelMap model ) {
    	if(result.hasErrors()) {
    		return "obras";
    	}
    	obrasocialService.addObrasocial(obrasocial);
    	model.addAttribute("success", "Obra social " + obrasocial.getNombre() + " registrada exitosamente!");
    	
    	return "success";
    }
    
    /*
     * This method will delete an obra social by it's os_id value.
     */
    @RequestMapping(value = { "/delete-{os_id}-obrasocial" }, method = RequestMethod.GET)
    public String deleteObrasocial(@PathVariable String os_id) {
    	long l = Long.parseLong(os_id);
    	obrasocialService.removeObrasocial(l);
    	return "redirect:/forms/obras.html";
    }
}
