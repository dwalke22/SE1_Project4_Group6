package edu.westga.cs3211.project4.formatter;

import edu.westga.cs3211.project4.model.Restaurant;

public class RestaurantFormatter {

	public RestaurantFormatter() {
		
	}
	
	public String FormatRestaurant(Restaurant restaurant) {
		String name = restaurant.getName();
		String distance = " is "+(Math.round(restaurant.getDistance()*100.0)/100.0) + " miles away ";
		String reviewScore = "with a review score of " + (Math.round(restaurant.getReviewScore()*100.0)/100.0) + " star(s).";
		
		return name + distance + reviewScore;
	}
}
