package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		//No need to create object just focus on logic use run method's return object
		//ConfigurableApplicationContext context.
		//Alien a = new Alien();
		
		//context will give the object whose type is Alien.class Bean 
		//since @Component annotation Alien class it will create a Bean id "alien" since class is "Alien"..
		//Alien a = context.getBean(Alien.class);
		
		Alien1 a = context.getBean(Alien1.class);
		
		a.show();
		
		Alien1 a1 = context.getBean(Alien1.class);
		
		a.show();
		
	}

}
