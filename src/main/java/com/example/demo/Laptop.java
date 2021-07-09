package com.example.demo;

import org.springframework.stereotype.Component;

//Laptop has top be instantiated in-order to use it in Alien class, it is done by using @component.
@Component
public class Laptop {

	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile1() {
		System.out.println("Compiles ");
	}
}
