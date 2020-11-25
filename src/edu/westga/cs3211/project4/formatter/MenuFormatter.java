package edu.westga.cs3211.project4.formatter;

import edu.westga.cs3211.project4.model.Menu;
import edu.westga.cs3211.project4.model.MenuItem;

/**
 * used to format a menu's information
 * @author Sam
 *
 */
public class MenuFormatter {

	/**
	 * formats a menu's information into a single string with a line for each menuItem in the menu
	 * @preconditions menu must not be null
	 * @postconditions none
	 * @param menu the menu to be formatted
	 * @return the formatted string
	 */
	public String formatMenu(Menu menu) {
		if (menu == null) {
			throw new IllegalArgumentException("menu cannot be null");
		}
		String formattedString = menu.getRestaurantName() + System.lineSeparator();
		
		for (MenuItem currentItem : menu.getItemCollection()) {
			formattedString += currentItem.getName() + "- $" + (Math.round(currentItem.getPrice()*100.0)/100.0) + System.lineSeparator();
		}
		
		return formattedString;
		
	}
}
