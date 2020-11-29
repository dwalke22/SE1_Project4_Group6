package edu.westga.cs3211.project4.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import edu.westga.cs3211.project4.model.RestaurantCollection;

/**
 * handles loading in the file of restaurants
 * @author Sam
 *
 */
public class RestaurantFileHandler {
	
	
	/**
	 * deSerializes the Restaurants located in the project folder, and returns them as a RestaurantCollection
	 * @preconditions none
	 * @postconditions none
	 * @return the deserialized collection of restaurants
	 */
	public RestaurantCollection DeSerializeRestaurants() {
		
		
		RestaurantCollection readInCollection = null;
			try {
				FileInputStream inputFile = new FileInputStream("Restaurants");
				ObjectInputStream in = new ObjectInputStream(inputFile);
				
				readInCollection = (RestaurantCollection)in.readObject();
				
				in.close();
				inputFile.close();
				
			} catch (IOException | ClassNotFoundException e) {
				
			}
			
			return readInCollection;
		}
	
	
		
	}

