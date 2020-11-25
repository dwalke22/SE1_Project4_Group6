package edu.westga.cs3211.project1.model;

public class Restaurant {
	private double reviewScore;
	
	private double distance;
	
	private Menu menu;
	
	private String name;
	
	public Restaurant(double distance, double reviewScore, Menu menu, String name) {
		this.distance = distance;
		this.reviewScore = reviewScore;
		this.menu = menu;
		this.name = name;
	}
	
	public double getPriceRange() {
		return this.menu.getPriceRange();
	}
}
