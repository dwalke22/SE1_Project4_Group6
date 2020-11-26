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
	
	public RestaurantCollection DeSerializeRestaurants(File file) {
		RestaurantCollection readInCollection = null;
			try {
				FileInputStream inputFile = new FileInputStream(file);
				ObjectInputStream in = new ObjectInputStream(inputFile);
				
				readInCollection = (RestaurantCollection)in.readObject();
				
				in.close();
				inputFile.close();
				
			} catch (IOException | ClassNotFoundException e) {
				
				
			}
			
			return readInCollection;
		}
		
	}

