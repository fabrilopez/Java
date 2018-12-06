package com.fabricio.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fabricio.beans.AppConfig;
import com.fabricio.beans.AppConfig2;
import com.fabricio.beans.Mundo;
import com.fabricio.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/fabricio/xml/beans.xml");
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		//AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		//appContext.register(AppConfig.class);
		//appContext.register(AppConfig2.class);
		//appContext.refresh();
		
		
		//Mundo m = (Mundo) appContext.getBean("marte");
				
		//System.out.println(m.getSaludo());
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/fabricio/xml/beans.xml");
		Persona per =(Persona) appContext.getBean(Persona.class);
		
		System.out.println(per.getId() + " " + per.getNombre()
				+ " " + per.getApodo() + " " + per.getPais().getNombre() + 
				" " + per.getPais().getCiudad().getNombre());
		
	}

}
