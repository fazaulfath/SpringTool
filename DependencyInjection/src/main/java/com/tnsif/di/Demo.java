package com.tnsif.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {
	
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("b96.xml");
		System.out.println("class loaded");
		Vehicle c1 = c.getBean(Car.class);
	}

}
