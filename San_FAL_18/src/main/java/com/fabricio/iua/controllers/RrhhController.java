package com.fabricio.iua.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fabricio.iua.repository.FileFormBean;

@Controller
@RequestMapping("rrhh.html")
public class RrhhController {
	/*
	 * Metodo que crea una clase POJO para cargar el CV
	 */
	
	@RequestMapping(value = "/forms/rrhh.html", method =RequestMethod.GET)
	public @ModelAttribute("fileFormBean") FileFormBean showForm() {
		System.out.println("Metodo GET - RrhhController");
		return new FileFormBean();
	}
	
	/*
	 * Metodoo que lee el fichero igresado y llama al método para grabarlo
	 * 
	 */
	
	@RequestMapping(method = RequestMethod.POST)
	public @ModelAttribute("message") String guardarCV(@ModelAttribute FileFormBean fileFormBean) {
		try {
			grabarFicheroALocal(fileFormBean);
		} catch (Exception e) {
			e.printStackTrace();
			return "No se ha podido grabar el CV";
		}
    	
    	return "Felicitaciónes!! Su CV ha sido cargado correctamente";
	}
	
	/*
	 * Metodo que recibe el fichero y lo graba en la ruta 
	 * especificada
	 * 
	 * Deberá configurarse el valor de la ruta de acuerdo al sistema de archivos
	 * c://temp// para probar en windows
	 * 
	 * 
	 */
	private void grabarFicheroALocal(FileFormBean fileFormBean) throws Exception {
		CommonsMultipartFile uploaded = fileFormBean.getFichero();
		String ruta = "/tmp/curriculums/";
    	File localFile = new File(ruta+uploaded.getOriginalFilename());
    	FileOutputStream os = null;
    	
    	try {
    		
    		os = new FileOutputStream(localFile);
    		os.write(uploaded.getBytes());
    		
    	} finally {
    		if (os != null) {
    			try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
    		}
    	}
	}

}
