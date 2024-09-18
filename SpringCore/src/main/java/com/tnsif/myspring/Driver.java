package com.tnsif.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Config loaded");
		Sim a = c.getBean(Airtel.class);
		a.calling();
		a.data();
	}
}
