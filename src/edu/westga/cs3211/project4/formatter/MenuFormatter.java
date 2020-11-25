package edu.westga.cs3211.project4.formatter;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;

public class MenuFormatter {

	public MenuFormatter() {
		
	}
	
	public String formatMenu(Menu menu) {
		String formattedString = menu.getRestaurantName() + System.lineSeparator();
		
		for (MenuItem currentItem : menu.getItemCollection()) {
			formattedString += currentItem.getName() + "- $" + (Math.round(currentItem.getPrice()*100.0)/100.0) + System.lineSeparator();
		}
		
		return formattedString;
		
	}
}
