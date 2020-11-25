package edu.westga.cs3211.project4.formatter;

import edu.westga.cs3211.project4.model.Restaurant;

/**
 * used to format a restaurant's information
 * @author Sam
 *
 */
public class RestaurantFormatter {

	
	/**
	 * formats a restaruant's data to be displayed as a single string
	 * @preconditions restaurant is not null
	 * @postconditions none
	 * @param restaurant the restaurant to be formatted
	 * @return the formatted string
	 */
	public String FormatRestaurant(Restaurant restaurant) {
		if (restaurant == null) {
			throw new IllegalArgumentException("restaurant cannot be null");
		}
		String name = restaurant.getName();
		String distance = " is "+(Math.round(restaurant.getDistance()*100.0)/100.0) + " miles away ";
		String reviewScore = "with a review score of " + (Math.round(restaurant.getReviewScore()*100.0)/100.0) + " star(s).";
		
		return name + distance + reviewScore;
	}
}
