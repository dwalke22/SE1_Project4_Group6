package edu.westga.cs3211.project4.model;

/**
 * stores the information of a single item in a menu
 * @author Sam
 *
 */
public class MenuItem {

	private String name;
	
	private double price;
	
	
	/**
	 * creates a new MenuItem
	 * @preconditions name is not null && price is greater than zero
	 * @postconditions a new MenuItem is created
	 * @param name the name of the MenuItem
	 * @param price the price of the MenuItem
	 */
	public MenuItem(String name, double price) {
		if (name == null) {
			throw new IllegalArgumentException("the name cannot be null");
		}
		if (price <= 0) {
			throw new IllegalArgumentException("the price must be greater than zero");
		}
		this.name = name;
		this.price = price;
	}


	/**
	 * gets the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * gets the price
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	
}
