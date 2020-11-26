package edu.westga.cs3211.project4.ViewModel;

import edu.westga.cs3211.project4.filehandling.RestaurantFileHandler;
import edu.westga.cs3211.project4.formatter.MenuFormatter;
import edu.westga.cs3211.project4.formatter.RestaurantFormatter;
import edu.westga.cs3211.project4.model.Restaurant;
import edu.westga.cs3211.project4.model.RestaurantCollection;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class ResturantPickerViewModel {
	
	private final DoubleProperty priceRangeProperty;
	private final DoubleProperty ratingRangeProperty;
	private final DoubleProperty distanceProperty;	
	private final ListProperty<Restaurant> resturantListProperty;
	private final StringProperty restaurantDetailProperty;
	private final StringProperty menuDetailProperty;
	
	private RestaurantCollection resturantCollection;
	private RestaurantFormatter restaurantFormatter;
	private MenuFormatter menuFormatter;
	
	/*
	 * Instantiates a new view model
	 * 
	 * @precondition none
	 * @postcondition priceRangeProperty() != null && ratingRangeProperty() != null
	 * 				  && distanceProperty() != null && resturantListProperty() != null
	 */
	public ResturantPickerViewModel() {
		this.priceRangeProperty = new SimpleDoubleProperty();
		this.ratingRangeProperty = new SimpleDoubleProperty();
		this.distanceProperty = new SimpleDoubleProperty();
		this.resturantCollection = new RestaurantCollection();
		this.resturantListProperty = new SimpleListProperty<Restaurant>();
		this.restaurantDetailProperty = new SimpleStringProperty();
		this.menuDetailProperty = new SimpleStringProperty();
		
		this.restaurantFormatter = new RestaurantFormatter();
		this.menuFormatter = new MenuFormatter();
	}
	
	/*
	 * Gets the price range property
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the price range property
	 */
	public DoubleProperty priceRangeProperty() {
		return priceRangeProperty;
	}

	/*
	 * Gets the rating range property
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the rating range property
	 */
	public DoubleProperty ratingRangeProperty() {
		return ratingRangeProperty;
	}

	/*
	 * Gets the distance property
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the distance property
	 */
	public DoubleProperty distanceProperty() {
		return distanceProperty;
	}

	/*
	 * Gets the restaurant list property
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the restaurant list property
	 */
	public ListProperty<Restaurant> resturantListProperty() {
		return resturantListProperty;
	}
	
	/*
	 * Gets the restaurantDetailProperty
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the restaurant detail property
	 */
	public StringProperty restaurantDetailProperty() {
		return restaurantDetailProperty;
	}

	/*
	 * Gets the menu detail property
	 * 
	 * @precondition none
	 * @postcondition
	 * 
	 * @return the menu detail property
	 */
	public StringProperty menuDetailProperty() {
		return menuDetailProperty;
	}

	/**
	 * Applies the filters and gathers the resulting restaurants
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void applyFilters() {
		RestaurantCollection filteredCollection = this.resturantCollection;
		if (this.priceRangeProperty != null) {
			filteredCollection = filteredCollection.filterByPriceRange(this.priceRangeProperty.doubleValue());
		}
		if (this.ratingRangeProperty != null) {
			filteredCollection = filteredCollection.filterByReview(this.ratingRangeProperty.doubleValue());
		}
		if (this.distanceProperty != null) {
			filteredCollection = filteredCollection.filterByLocation(this.distanceProperty.doubleValue());
		}
		this.updateDisplay(filteredCollection);
	}

	private void updateDisplay(RestaurantCollection filteredCollection) {
		this.resturantListProperty.set(FXCollections.observableArrayList(filteredCollection.getRestaurants()));
		
	}
	
	/**
	 * Resets the applied filters
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void resetFilters() {
		this.updateDisplay(this.resturantCollection);
	}
	
	/*
	 * Loads a file for restaurants into the collection
	 * 
	 * @precondition file != null
	 * @postcondition none
	 */
	public void loadFile() {
		RestaurantFileHandler fileHandler = new RestaurantFileHandler();
		RestaurantCollection loadedCollection = fileHandler.DeSerializeRestaurants();
		this.resturantCollection.setRestaurants(loadedCollection.getRestaurants());
		this.resturantListProperty.set(FXCollections.observableArrayList(this.resturantCollection.getRestaurants()));
	}

	/*
	 * Formats the selected  for the ui
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void formatSelectedResturant(Restaurant newRestaurant) {
		this.restaurantDetailProperty.set(this.restaurantFormatter.FormatRestaurant(newRestaurant));
		this.menuDetailProperty.set(this.menuFormatter.formatMenu(newRestaurant.getMenu()));
	}
}