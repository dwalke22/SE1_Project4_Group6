package edu.westga.cs3211.project4.model;

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

	public double getReviewScore() {
		return reviewScore;
	}

	public double getDistance() {
		return distance;
	}

	public Menu getMenu() {
		return menu;
	}

	public String getName() {
		return name;
	}
	
}
