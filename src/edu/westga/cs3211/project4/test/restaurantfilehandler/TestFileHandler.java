package edu.westga.cs3211.project4.test.restaurantfilehandler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.project4.filehandling.RestaurantFileHandler;
import edu.westga.cs3211.project4.model.RestaurantCollection;

class TestFileHandler {

	@Test
	void testValidFile() {
		RestaurantFileHandler testHandler = new RestaurantFileHandler();
		
		RestaurantCollection testCollection = testHandler.DeSerializeRestaurants();
		
		assertEquals(testCollection.size(),8);
	}

}
