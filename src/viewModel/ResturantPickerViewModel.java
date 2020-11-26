package viewModel;

import edu.westga.cs3211.project4.model.Restaurant;
import edu.westga.cs3211.project4.model.RestaurantCollection;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

public class ResturantPickerViewModel {
	
	private final DoubleProperty priceRangeProperty;
	private final DoubleProperty ratingRangeProperty;
	private final IntegerProperty distanceProperty;	
	private final ListProperty<Restaurant> resturantListProperty;
	
	private RestaurantCollection resturantCollection;
	
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
		this.distanceProperty = new SimpleIntegerProperty();
		this.resturantCollection = new RestaurantCollection();
		this.resturantListProperty = new SimpleListProperty<Restaurant>(FXCollections.observableArrayList(this.resturantCollection.getRestaurants()));
	}
}