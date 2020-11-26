package view;

import edu.westga.cs3211.project4.model.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GUICodeBehind {

	 @FXML
	 private ListView<Restaurant> resturantListView;

	 @FXML
	 private TextField priceTextField;

	 @FXML
	 private TextField ratingTextField;

	 @FXML
	 private Button applyFilterButton;

	 @FXML
	 private Button resetFiltersButton;

	 @FXML
	 private Button loadAllResturantsButton;

	 @FXML
	 private Button loadAllMenusButton;

	 @FXML
	 private TextArea resturantTextArea;

	 @FXML
	 private TextArea menuTextArea;

	 @FXML
	 private TextField distanceTextField;

	 @FXML
	 void handleApplyFilters(ActionEvent event) {

	 }

	 @FXML
	 void handleLoadAllMenues(ActionEvent event) {

	 }

	 @FXML
	 void handleLoadAllResturants(ActionEvent event) {

	 }

	 @FXML
	 void handleResetFilter(ActionEvent event) {

	 }
}
