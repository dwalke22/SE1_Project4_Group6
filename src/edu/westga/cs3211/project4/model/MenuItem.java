package edu.westga.cs3211.project4.model;

public class MenuItem {

	private String name;
	
	private double price;
	
	
	public MenuItem(String name, double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}
	
	
}
