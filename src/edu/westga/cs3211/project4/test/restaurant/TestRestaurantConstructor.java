package edu.westga.cs3211.project4.test.restaurant;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;
import edu.westga.cs3211.project4.model.Restaurant;

class TestRestaurantConstructor {

	@Test
	void testValidConstructor() {
		MenuItem item1 = new MenuItem("test1",5.70);
		MenuItem item2 = new MenuItem("test2",7.45);
		MenuItem item3 = new MenuItem("test3",10.0);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);
		Menu testMenu = new Menu(arrayList,"restaurant");
		Restaurant testRestaurant = new Restaurant(5.3,3,testMenu,"restaurant");
		
		assertEquals(testRestaurant.getDistance(),5.3);
		assertEquals(testRestaurant.getReviewScore(),3);
		assertEquals(testRestaurant.getMenu(),testMenu);
		assertEquals(testRestaurant.getName(),"restaurant");
	}
	
	@Test
	void testInvalidDistance() {
		MenuItem item1 = new MenuItem("test1",5.70);
		MenuItem item2 = new MenuItem("test2",7.45);
		MenuItem item3 = new MenuItem("test3",10.0);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);
		Menu testMenu = new Menu(arrayList,"restaurant");
		
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					Restaurant testRestaurant = new Restaurant(0,3,testMenu,"restaurant");
				});
		
	}
	
	@Test
	void testInvalidReviewScore() {
		MenuItem item1 = new MenuItem("test1",5.70);
		MenuItem item2 = new MenuItem("test2",7.45);
		MenuItem item3 = new MenuItem("test3",10.0);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);
		Menu testMenu = new Menu(arrayList,"restaurant");
		
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					Restaurant testRestaurant = new Restaurant(3.65,-1,testMenu,"restaurant");
				});
		
	}
	
	@Test
	void testNullMenu() {
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					Restaurant testRestaurant = new Restaurant(1,0,null,"restaurant");
				});
		
	}
	
	@Test
	void testNullName() {
		MenuItem item1 = new MenuItem("test1",5.70);
		MenuItem item2 = new MenuItem("test2",7.45);
		MenuItem item3 = new MenuItem("test3",10.0);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);
		Menu testMenu = new Menu(arrayList,"restaurant");
		
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					Restaurant testRestaurant = new Restaurant(3.65,4,testMenu,null);
				});
		
	}

}
