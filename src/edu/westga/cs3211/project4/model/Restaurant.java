package edu.westga.cs3211.project4.model;

public class Restaurant implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double reviewScore;
	
	private double distance;
	
	private Menu menu;
	
	private String name;
	
	/**
	 * creates a new restaurant
	 * @preconditions menu is not null
	 * 				  name is not null
	 * 				  distance is greater than zero
	 * 				  reviewScore is not negative
	 * @postconditions a new Restaurant item is created
	 * @param distance the desired distance
	 * @param reviewScore the desired review score
	 * @param menu the menu 
	 * @param name the restaurant's name
	 */
	public Restaurant(double distance, double reviewScore, Menu menu, String name) {
		if (menu == null) {
			throw new IllegalArgumentException("menu cannot be null");
		}
		
		if (name == null) {
			throw new IllegalArgumentException("name cannot be null");
		}
		if (distance <= 0) {
			throw new IllegalArgumentException("distance must be greater than zero");
		}
		if (reviewScore < 0) {
			throw new IllegalArgumentException("reviewScore must not be negative");
		}
		this.distance = distance;
		this.reviewScore = reviewScore;
		this.menu = menu;
		this.name = name;
	}
	
	/**
	 * gets the price range of the menu
	 * @return the menu's price range
	 */
	public double getPriceRange() {
		return this.menu.getPriceRange();
	}

	/**
	 * gets the review score
	 * @return the review score
	 */
	public double getReviewScore() {
		return reviewScore;
	}

	/**
	 * gets the distance
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * gets the menu
	 * @return the menu
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * gets the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
