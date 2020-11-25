package edu.westga.cs3211.project4.model;

import java.util.ArrayList;

public class RestaurantCollection {
	
	private ArrayList<Restaurant> restaurants;
		
	public RestaurantCollection(ArrayList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	public RestaurantCollection filterByLocation(double desiredDistance) {
		ArrayList<Restaurant> filteredRestaurants = new ArrayList<Restaurant>();
		for (Restaurant currentRestaurant : this.restaurants) {
			if (currentRestaurant.getDistance() <= desiredDistance) {
				filteredRestaurants.add(currentRestaurant);
			}
		}
		
		return new RestaurantCollection(filteredRestaurants);
	}
	
	public RestaurantCollection filterByPriceRange(double desiredPriceRange) {
		ArrayList<Restaurant> filteredRestaurants = new ArrayList<Restaurant>();
		for (Restaurant currentRestaurant : this.restaurants) {
			if (currentRestaurant.getPriceRange() <= desiredPriceRange) {
				filteredRestaurants.add(currentRestaurant);
			}
		}
		
		return new RestaurantCollection(filteredRestaurants);
	}
	
	public RestaurantCollection filterByReview(double desiredReviewScore) {
		ArrayList<Restaurant> filteredRestaurants = new ArrayList<Restaurant>();
		for (Restaurant currentRestaurant : this.restaurants) {
			if (currentRestaurant.getReviewScore() >= desiredReviewScore) {
				filteredRestaurants.add(currentRestaurant);
			}
		}
		
		return new RestaurantCollection(filteredRestaurants);
	}
}
