package edu.westga.cs3211.project1.model;

import java.util.ArrayList;

public class Menu {
	
	private ArrayList<MenuItem> itemCollection;
	
	private String restaurantName;
	
	public Menu(ArrayList<MenuItem> items, String restaurantName) {
		this.itemCollection = items;
		this.restaurantName = restaurantName;
	}
	
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
}
