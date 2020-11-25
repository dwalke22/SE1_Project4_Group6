package edu.westga.cs3211.project4.test.menu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;

class TestMenuConstructor {

	@Test
	void testInvalidNumberItems() {
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		assertThrows(IllegalArgumentException.class,
				()-> {
					Menu testMenu = new Menu(arrayList,"restaurant");
				});
	}
		
	@Test
	void testNullItems() {
		ArrayList<MenuItem> arrayList = null;
		assertThrows(IllegalArgumentException.class,
				()-> {
					Menu testMenu = new Menu(arrayList,"restaurant");
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
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					Menu testMenu = new Menu(arrayList,null);
				});
	}
	
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
		assertEquals(testMenu.getRestaurantName(),"restaurant");
		assertEquals(testMenu.getItemCollection(),arrayList);
		
	}
	
	
}
