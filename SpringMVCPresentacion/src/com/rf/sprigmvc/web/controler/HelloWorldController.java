package com.rf.sprigmvc.web.controler;

import org.springframework.web.servlet.mvc.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldController implements Controller{
	
	protected final Log logger =  LogFactory.getLog(getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response )
		throws ServletException, IOException{
		logger.info("Devolver lavista");
		
		return new ModelAndView("helloworld.jsp");
	}
	
}
