package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien1 {
	
	//To check how many objects created. Even if we don't create object using "ConfigurableApplicationContext context"
	// ie Alien a = context.getBean(Alien.class);   in DemoApplication.java.   Spring will create an object.
	//That is the moment the application is started it will give the object.
	public Alien1() {
		super();
		System.out.println("Object created");
	}

	private int aid;
	private String aname;
	private String tech;
	
	//Alien object is depend on Laptop object, to connect them we use @Autowired
	//It says hey Alien search for laptop object. It will try to find the object in this container.
	//By default @Autowired search for the type
	@Autowired
	private Laptop laptop;
	
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
	

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show() {
		System.out.println("Show called");
		laptop.compile1();
	}
}

//@Qualifier("name") searches by name whereas @Autowired searches by type.
