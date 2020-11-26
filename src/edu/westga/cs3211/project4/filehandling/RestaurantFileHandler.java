package edu.westga.cs3211.project4.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import edu.westga.cs3211.project4.formatter.MenuFormatter;
import edu.westga.cs3211.project4.formatter.RestaurantFormatter;
import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;
import edu.westga.cs3211.project4.model.Restaurant;
import edu.westga.cs3211.project4.model.RestaurantCollection;

public class RestaurantFileHandler {
	
	public void deSerializeRestaurants() {
		
		JFileChooser fc = new JFileChooser();
		
		int result = fc.showOpenDialog(null);
		
		if (JFileChooser.APPROVE_OPTION == result) {
			File selectedFile = fc.getSelectedFile();
			
			FileInputStream inputFile;
			try {
				inputFile = new FileInputStream(selectedFile);
				ObjectInputStream in = new ObjectInputStream(inputFile);
				
				RestaurantCollection readInCollection = (RestaurantCollection)in.readObject();
				
				in.close();
				inputFile.close();
				
				RestaurantFormatter testFormatter = new RestaurantFormatter();
				MenuFormatter testMenuFormatter = new MenuFormatter();
				for (Restaurant currRestaurant : readInCollection.getRestaurants()) {
					System.out.println(testFormatter.FormatRestaurant(currRestaurant));
					System.out.println(testMenuFormatter.formatMenu(currRestaurant.getMenu()));
				}
				
			} catch (IOException | ClassNotFoundException e) {
				
				System.out.println("loading exception caught");
			}
		}
		else {
			System.out.println("file not picked");
		}
		
		
		
	}
}
