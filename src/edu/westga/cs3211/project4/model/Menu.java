package edu.westga.cs3211.project4.model;

import java.util.ArrayList;

/**
 * stores information about an entire menu
 * @author Sam
 *
 */
public class Menu {
	
	private ArrayList<MenuItem> itemCollection;
	
	private String restaurantName;
	
	/**
	 * creates a new Menu item
	 * @preconditions items is not null && has more than one item
	 * 			      restaurantName is not null
	 * @postconditions a new Menu item is created
	 * @param items the MenuItems used to make up the menu
	 * @param restaurantName the name of the restaurant this menu belongs to
	 */
	public Menu(ArrayList<MenuItem> items, String restaurantName) {
		if (items == null) {
			throw new IllegalArgumentException("items cannot be null");
		}
		if (items.size() == 0) {
			throw new IllegalArgumentException("items must have atleast one item");
		}
		if (restaurantName == null) {
			throw new IllegalArgumentException("restaurantName cannot be null");
		}
		
		this.itemCollection = items;
		this.restaurantName = restaurantName;
	}
	
	/**
	 * gets the price range of the menu
	 * @preconditions none
	 * @postconditions none
	 * @return the price range of the menu
	 */
	public double getPriceRange() {
		double max = getMaxPrice();
		double min = getMinPrice();
		return max - min;
		
	}

	private double getMaxPrice() {
		double max = Double.MIN_VALUE;
		for (MenuItem currentItem : this.itemCollection) {
			if (currentItem.getPrice() > max) {
				max = currentItem.getPrice();
			}
		}
		return max;
	}
	
	private double getMinPrice() {
		double min = Double.MAX_VALUE;
		for (MenuItem currentItem : this.itemCollection) {
			if (currentItem.getPrice() < min) {
				min = currentItem.getPrice();
			}
		}
		return min;
	}

	/**gets the MenuItems
	 * @return the menuItems
	 */
	public ArrayList<MenuItem> getItemCollection() {
		return itemCollection;
	}

	/**gets the restaurant name
	 * @return the restaurant name
	 */
	public String getRestaurantName() {
		return restaurantName;
	}
	
	
}
