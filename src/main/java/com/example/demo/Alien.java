package com.example.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


public class Alien {
	
	//To check how many objects created. Even if we don't create object using "ConfigurableApplicationContext context"
	// ie Alien a = context.getBean(Alien.class);   in DemoApplication.java.   Spring will create an object.
	//That is the moment the application is started it will give the object.
	public Alien() {
		super();
		System.out.println("Object created");
	}

	private int aid;
	private String aname;
	private String tech;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	public void show() {
		System.out.println("Show called");
	}
}
