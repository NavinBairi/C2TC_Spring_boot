package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	/*	Airtel a  = new Airtel();
		a.calling();
		a.data();
		
		Jio j = new Jio();
		j.calling();
		j.data();*/
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
	//Airtel a = (Airtel)c.getBean("airtel");
	
	Sim s =c.getBean("sim",Sim.class);
		s.calling();
		s.data();
	
	}

}
