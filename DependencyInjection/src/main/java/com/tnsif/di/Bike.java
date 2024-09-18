package com.tnsif.di;

public class Bike implements Vehicle{
	String name;
	String model;
	
	public Bike() {
		super();
	}

	public Bike(String name, String model) {
		super();
		this.name = name;
		this.model = model;
		System.out.println(name+" "+model);
	}

	public void info() {
		
	}
}
