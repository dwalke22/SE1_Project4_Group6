package viewModel;

import edu.westga.cs3211.project4.model.Restaurant;
import edu.westga.cs3211.project4.model.RestaurantCollection;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

public class ResturantPickerViewModel {
	
	private final DoubleProperty priceRangeProperty;
	private final DoubleProperty ratingRangeProperty;
	private final DoubleProperty distanceProperty;	
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
		this.distanceProperty = new SimpleDoubleProperty();
		this.resturantCollection = new RestaurantCollection();
		this.resturantListProperty = new SimpleListProperty<Restaurant>(FXCollections.observableArrayList(this.resturantCollection.getRestaurants()));
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
	
	
}