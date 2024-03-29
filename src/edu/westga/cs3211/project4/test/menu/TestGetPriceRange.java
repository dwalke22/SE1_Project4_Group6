package edu.westga.cs3211.project4.test.menu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;

class TestGetPriceRange {

	@Test
	void testThreeItems() {
		MenuItem item1 = new MenuItem("test1",5.70);
		MenuItem item2 = new MenuItem("test2",7.45);
		MenuItem item3 = new MenuItem("test3",10.0);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		arrayList.add(item3);
		Menu testMenu = new Menu(arrayList,"restaurant");
		
		assertEquals(testMenu.getPriceRange(),5,70);
	}
	
	@Test
	void testOneItems() {
		MenuItem item1 = new MenuItem("test1",2.33);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		Menu testMenu = new Menu(arrayList,"restaurant");
		
		assertEquals(testMenu.getPriceRange(),2.33);
	}
	
	@Test
	void testTwoItemsSamePrice() {
		MenuItem item1 = new MenuItem("test1",5.70);
		MenuItem item2 = new MenuItem("test2",5.70);
		ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
		arrayList.add(item1);
		arrayList.add(item2);
		Menu testMenu = new Menu(arrayList,"restaurant");
		
		assertEquals(testMenu.getPriceRange(),5.70);
	}

}
