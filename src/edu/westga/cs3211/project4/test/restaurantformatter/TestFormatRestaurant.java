package edu.westga.cs3211.project4.test.restaurantformatter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.formatter.RestaurantFormatter;
import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;
import edu.westga.cs3211.project4.model.Restaurant;

class TestFormatRestaurant {

	@Test
	void testValidRestaurant() {
		MenuItem item1 = new MenuItem("test1",5.70);
		MenuItem item2 = new MenuItem("test2",7.45);
		MenuItem item3 = new MenuItem("test3",10.0);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);
		Menu testMenu = new Menu(arrayList,"restaurant");
		Restaurant testRestaurant = new Restaurant(5.3,3,testMenu,"restaurant");
		
		RestaurantFormatter testFormatter = new RestaurantFormatter();
		
		assertEquals(testFormatter.FormatRestaurant(testRestaurant),"restaurant is 5.3 miles away with a review score of 3.0 star(s).");
	}
	
	@Test
	void testNullRestaurant() {
		
		
		RestaurantFormatter testFormatter = new RestaurantFormatter();
		assertThrows(IllegalArgumentException.class,
				()-> {
					testFormatter.FormatRestaurant(null);
				});
		
	}

}
