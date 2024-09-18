package com.tnsif.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("autowire.xml");
		Human hum = c.getBean("human", Human.class);
		hum.startPumping();
	}

}