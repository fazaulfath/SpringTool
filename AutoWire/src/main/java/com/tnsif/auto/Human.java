package com.tnsif.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;  //heart class reference
	//the ref name and id of the bean in xml file should be same for autowire
	
	
	public Heart getHeart() {
		return heart;
	}
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void startPumping() {
		if(heart != null) {
			heart.pump();
		}
		else {
			System.out.println("dead");
		}
	}
	
	@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	
	
}