package edu.westga.cs3211.project4.test.menuitem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;

class TestMenuItemConstructor {

	@Test
	void testNullName() {
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					MenuItem item1 = new MenuItem(null,5.70);
				});
	}
	
	@Test
	void testNegativePrice() {
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					MenuItem item1 = new MenuItem("item1",-5.70);
				});
	}
	
	@Test
	void testZeroPrice() {
		
		assertThrows(IllegalArgumentException.class,
				()-> {
					MenuItem item1 = new MenuItem("item1",0);
				});
	}
	
	@Test
	void testValidConstructor() {
		
		MenuItem item1 = new MenuItem("item1",5.70);
		assertEquals(item1.getName(),"item1");
		assertEquals(item1.getPrice(),5.70);
				
	}

}
