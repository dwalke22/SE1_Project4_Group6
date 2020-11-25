package edu.westga.cs3211.project4.model;

import java.util.ArrayList;

public class RestaurantCollection {
	
	private ArrayList<Restaurant> restaurants;
		
	/**
	 * creates a new restaurant collection
	 * @preconditions restaurants must not be null
	 * @postconditions a RestaurantCollection object is created
	 * @param restaurants the restaurants held in the collection
	 */
	public RestaurantCollection(ArrayList<Restaurant> restaurants) {
		if (restaurants == null) {
			throw new IllegalArgumentException("restaurants cannot be null");
		}
		this.restaurants = restaurants;
	}
	
	/**
	 * filters out restaurants with a location higher than the desiredDistance,
	 * then returns a new RestaurantCollection with only restaurants within the desired distance
	 * @preconditions desiredDistance is greater than zero
	 * @postconditions none
	 * @param desiredDistance the desired distance
	 * @return the new collection containing restaurants within the desired distance
	 */
	public RestaurantCollection filterByLocation(double desiredDistance) {
		if (desiredDistance <= 0) {
			throw new IllegalArgumentException("desiredDistance must be greater than zero");
		}
		ArrayList<Restaurant> filteredRestaurants = new ArrayList<Restaurant>();
		for (Restaurant currentRestaurant : this.restaurants) {
			if (currentRestaurant.getDistance() <= desiredDistance) {
				filteredRestaurants.add(currentRestaurant);
			}
		}
		
		return new RestaurantCollection(filteredRestaurants);
	}
	
	/**
	 * filters out restaurants with a price range bigger than the desiredPriceRange,
	 * then returns a new RestaurantCollection with only restaurants within the given price range
	 * @preconditions desiredPriceRange is greater than zero
	 * @postconditions none
	 * @param desiredPriceRange the desired price range
	 * @return the new collection containing restaurants within the desired price range
	 */
	public RestaurantCollection filterByPriceRange(double desiredPriceRange) {
		if (desiredPriceRange <= 0) {
			throw new IllegalArgumentException("desiredPriceRange must be greater than zero");
		}
		ArrayList<Restaurant> filteredRestaurants = new ArrayList<Restaurant>();
		for (Restaurant currentRestaurant : this.restaurants) {
			if (currentRestaurant.getPriceRange() <= desiredPriceRange) {
				filteredRestaurants.add(currentRestaurant);
			}
		}
		
		return new RestaurantCollection(filteredRestaurants);
	}
	
	/**
	 * filters out restaurants with a review score lower than the desiredReviewScore
	 * then returns a new RestaurantCollection with only restaurants within the given price range
	 * @preconditions desiredReviewScore is not negative
	 * @postconditions none
	 * @param desiredReviewScore the desired review score
	 * @return the new collection containing restaurants above or equal to the desired review score
	 */
	public RestaurantCollection filterByReview(double desiredReviewScore) {
		if (desiredReviewScore < 0) {
			throw new IllegalArgumentException("desiredReviewScore must not be negative");
		}
		ArrayList<Restaurant> filteredRestaurants = new ArrayList<Restaurant>();
		for (Restaurant currentRestaurant : this.restaurants) {
			if (currentRestaurant.getReviewScore() >= desiredReviewScore) {
				filteredRestaurants.add(currentRestaurant);
			}
		}
		
		return new RestaurantCollection(filteredRestaurants);
	}

	/**
	 * gets the restaurants
	 * @return the restaurnats
	 */
	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}
	
	
}
