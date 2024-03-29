package edu.westga.cs3211.project4.test.restaurantcollection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;
import edu.westga.cs3211.project4.model.Restaurant;
import edu.westga.cs3211.project4.model.RestaurantCollection;

class TestRestaurantCollectionConstructor {

	

	@Test
	void testValidConstructor() {
		MenuItem item1 = new MenuItem("test1",5.70);
		ArrayList<MenuItem> arrayList1 = new ArrayList<MenuItem>();
		arrayList1.add(item1);
		Menu testMenu1 = new Menu(arrayList1,"restaurant1");
		Restaurant testRestaurant1 = new Restaurant(5.3,3,testMenu1,"restaurant1");
		
		MenuItem item4 = new MenuItem("test4",5.70);
		ArrayList<MenuItem> arrayList2 = new ArrayList<MenuItem>();
		arrayList2.add(item4);
		Menu testMenu2 = new Menu(arrayList2,"restaurant2");
		Restaurant testRestaurant2 = new Restaurant(5.3,3,testMenu2,"restaurant2");
		
		MenuItem item7 = new MenuItem("test7",5.70);
		ArrayList<MenuItem> arrayList3 = new ArrayList<MenuItem>();
		arrayList3.add(item7);
		Menu testMenu3 = new Menu(arrayList3,"restaurant3");
		Restaurant testRestaurant3 = new Restaurant(5.3,3,testMenu3,"restaurant3");
		
		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(testRestaurant1);
		restaurantList.add(testRestaurant2);
		restaurantList.add(testRestaurant3);
		
		RestaurantCollection testCollection = new RestaurantCollection(restaurantList);
		
		assertEquals(testCollection.getRestaurants(),restaurantList);
		
	}
	
	@Test
	void testInvalidList() {
	assertThrows(IllegalArgumentException.class,
			()-> {
				new RestaurantCollection(null);
			});
	}
	
	@Test
	void testParameterlessConstructor() {
		RestaurantCollection testCollection = new RestaurantCollection();
		
		assertEquals(testCollection.getRestaurants().size(),0);
	}
	
}
