package edu.westga.cs3211.project4.test.restaurantcollection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;
import edu.westga.cs3211.project4.model.Restaurant;
import edu.westga.cs3211.project4.model.RestaurantCollection;

class TestFilterByPriceRange {

	@Test
	void testFilterOutOneRestaurant() {
		MenuItem item1 = new MenuItem("test1",10);
		MenuItem item2 = new MenuItem("test2",6.80);
		ArrayList<MenuItem> arrayList1 = new ArrayList<MenuItem>();
		arrayList1.add(item1);
		arrayList1.add(item2);
		Menu testMenu1 = new Menu(arrayList1,"restaurant1");
		Restaurant testRestaurant1 = new Restaurant(5,3,testMenu1,"restaurant1");
		
		MenuItem item4 = new MenuItem("test4",5.70);
		MenuItem item5 = new MenuItem("test5",5.70);
		ArrayList<MenuItem> arrayList2 = new ArrayList<MenuItem>();
		arrayList2.add(item4);
		arrayList2.add(item5);
		Menu testMenu2 = new Menu(arrayList2,"restaurant2");
		Restaurant testRestaurant2 = new Restaurant(1,3,testMenu2,"restaurant2");
		
		MenuItem item7 = new MenuItem("test7",5.70);
		MenuItem item8 = new MenuItem("test8",5.40);
		ArrayList<MenuItem> arrayList3 = new ArrayList<MenuItem>();
		arrayList3.add(item7);
		arrayList3.add(item8);
		Menu testMenu3 = new Menu(arrayList3,"restaurant3");
		Restaurant testRestaurant3 = new Restaurant(1,3,testMenu3,"restaurant3");
		
		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(testRestaurant1);
		restaurantList.add(testRestaurant2);
		restaurantList.add(testRestaurant3);
		
		RestaurantCollection testCollection = new RestaurantCollection(restaurantList);
		
		RestaurantCollection filteredCollection = testCollection.filterByPriceRange(6);
		
		assertEquals(filteredCollection.getRestaurants().size(),2);
	}
	
	@Test
	void testFilterOutAllRestaurants() {
		MenuItem item1 = new MenuItem("test1",10);
		MenuItem item2 = new MenuItem("test2",5.50);
		ArrayList<MenuItem> arrayList1 = new ArrayList<MenuItem>();
		arrayList1.add(item1);
		arrayList1.add(item2);
		Menu testMenu1 = new Menu(arrayList1,"restaurant1");
		Restaurant testRestaurant1 = new Restaurant(5,3,testMenu1,"restaurant1");
		
		MenuItem item4 = new MenuItem("test4",5.70);
		MenuItem item5 = new MenuItem("test5",7.00);
		ArrayList<MenuItem> arrayList2 = new ArrayList<MenuItem>();
		arrayList2.add(item4);
		arrayList2.add(item5);
		Menu testMenu2 = new Menu(arrayList2,"restaurant2");
		Restaurant testRestaurant2 = new Restaurant(1,3,testMenu2,"restaurant2");
		
		MenuItem item7 = new MenuItem("test7",5.70);
		MenuItem item8 = new MenuItem("test8",7.99);
		ArrayList<MenuItem> arrayList3 = new ArrayList<MenuItem>();
		arrayList3.add(item7);
		arrayList3.add(item8);
		Menu testMenu3 = new Menu(arrayList3,"restaurant3");
		Restaurant testRestaurant3 = new Restaurant(1,3,testMenu3,"restaurant3");
		
		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(testRestaurant1);
		restaurantList.add(testRestaurant2);
		restaurantList.add(testRestaurant3);
		
		RestaurantCollection testCollection = new RestaurantCollection(restaurantList);
		
		RestaurantCollection filteredCollection = testCollection.filterByPriceRange(1);
		
		assertEquals(filteredCollection.getRestaurants().size(),0);
	}
	
	@Test
	void testFilterOutNoRestaurants() {
		MenuItem item1 = new MenuItem("test1",10);
		MenuItem item2 = new MenuItem("test2",5.50);
		ArrayList<MenuItem> arrayList1 = new ArrayList<MenuItem>();
		arrayList1.add(item1);
		arrayList1.add(item2);
		Menu testMenu1 = new Menu(arrayList1,"restaurant1");
		Restaurant testRestaurant1 = new Restaurant(5,3,testMenu1,"restaurant1");
		
		MenuItem item4 = new MenuItem("test4",5.70);
		MenuItem item5 = new MenuItem("test5",14.22);
		ArrayList<MenuItem> arrayList2 = new ArrayList<MenuItem>();
		arrayList2.add(item4);
		arrayList2.add(item5);
		Menu testMenu2 = new Menu(arrayList2,"restaurant2");
		Restaurant testRestaurant2 = new Restaurant(1,3,testMenu2,"restaurant2");
		
		MenuItem item7 = new MenuItem("test7",5.70);
		MenuItem item8 = new MenuItem("test8",9.40);
		ArrayList<MenuItem> arrayList3 = new ArrayList<MenuItem>();
		arrayList3.add(item7);
		arrayList3.add(item8);
		Menu testMenu3 = new Menu(arrayList3,"restaurant3");
		Restaurant testRestaurant3 = new Restaurant(1,3,testMenu3,"restaurant3");
		
		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(testRestaurant1);
		restaurantList.add(testRestaurant2);
		restaurantList.add(testRestaurant3);
		
		RestaurantCollection testCollection = new RestaurantCollection(restaurantList);
		
		RestaurantCollection filteredCollection = testCollection.filterByPriceRange(10);
		
		assertEquals(filteredCollection.getRestaurants().size(),3);
	}
	@Test
	void testInvalidParameters() {
		MenuItem item1 = new MenuItem("test1",5.70);
		ArrayList<MenuItem> arrayList1 = new ArrayList<MenuItem>();
		arrayList1.add(item1);
		Menu testMenu1 = new Menu(arrayList1,"restaurant1");
		Restaurant testRestaurant1 = new Restaurant(1,3,testMenu1,"restaurant1");
		
		MenuItem item4 = new MenuItem("test4",5.70);
		ArrayList<MenuItem> arrayList2 = new ArrayList<MenuItem>();
		arrayList2.add(item4);
		Menu testMenu2 = new Menu(arrayList2,"restaurant2");
		Restaurant testRestaurant2 = new Restaurant(1,3,testMenu2,"restaurant2");
		
		MenuItem item7 = new MenuItem("test7",5.70);
		ArrayList<MenuItem> arrayList3 = new ArrayList<MenuItem>();
		arrayList3.add(item7);
		Menu testMenu3 = new Menu(arrayList3,"restaurant3");
		Restaurant testRestaurant3 = new Restaurant(1,3,testMenu3,"restaurant3");
		
		ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(testRestaurant1);
		restaurantList.add(testRestaurant2);
		restaurantList.add(testRestaurant3);
		
		RestaurantCollection testCollection = new RestaurantCollection(restaurantList);
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					testCollection.filterByPriceRange(0);
				});
		
	}
}
