package edu.westga.cs3211.project4.View;

import edu.westga.cs3211.project4.ViewModel.ResturantPickerViewModel;
import edu.westga.cs3211.project4.model.Restaurant;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

public class GUICodeBehind {

	private ResturantPickerViewModel viewmodel;
	
	 @FXML
	 private ListView<Restaurant> resturantListView;

	 @FXML
	 private TextField priceTextField;
	 
	 @FXML
	 private Label priceErrorLabel;

	 @FXML
	 private TextField ratingTextField;
	 
	 @FXML
	 private Label ratingErrorLabel;

	 @FXML
	 private Button applyFilterButton;

	 @FXML
	 private Button resetFiltersButton;

	 @FXML
	 private Button loadAllResturantsButton;

	 @FXML
	 private Button selectRandomRestaurant;

	 @FXML
	 private TextArea resturantTextArea;

	 @FXML
	 private TextArea menuTextArea;

	 @FXML
	 private TextField distanceTextField;
	 
	 @FXML
	 private Label distacneErrorLabel;
	 
	 /*
	  * Instantiates a new code behind.
	  */
	 public GUICodeBehind() {
		 this.viewmodel = new ResturantPickerViewModel();
	 }
	 
	 @FXML
	 void initialize() {
		 this.bindToViewModel();
		 this.setUpEnablingOfControls();
		 this.setUpListenerForValidation();
		 this.setUpchangeListenerForListView();
	 }

	 private void setUpchangeListenerForListView() {
		this.resturantListView.getSelectionModel().selectedItemProperty()
			.addListener((observable, oldRestaurant, newRestaurant) -> {
				if (newRestaurant != null) {
					this.viewmodel.formatSelectedResturant(newRestaurant);
				}
			});

	}

	private void setUpListenerForValidation() {
		this.priceTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue != null) {
				if (!newValue.isEmpty() && !newValue.matches("[0-9]*\\.?[0-9]*")) {
					this.priceTextField.textProperty().setValue(oldValue);
					this.priceErrorLabel.setVisible(true);
				} else {
					this.priceErrorLabel.setVisible(false);
				}
			}
		});
		
		this.ratingTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue != null) {
				if (!newValue.isEmpty() && !newValue.matches("[0-9]*\\.?[0-9]*")) {
					this.ratingTextField.textProperty().setValue(oldValue);
					this.ratingErrorLabel.setVisible(true);
				} else {
					this.ratingErrorLabel.setVisible(false);
				}
			}
		});
		
		this.distanceTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue != null) {
				if (!newValue.isEmpty() && !newValue.matches("[0-9]*\\.?[0-9]*")) {
					this.distanceTextField.textProperty().setValue(oldValue);
					this.distacneErrorLabel.setVisible(true);
				} else {
					this.distacneErrorLabel.setVisible(false);
				}
			}
		});
	 }

	 private void setUpEnablingOfControls() {
		 BooleanBinding disableAddBinding = Bindings.or(this.priceTextField.textProperty().isEmpty(),
				this.ratingTextField.textProperty().isEmpty()).
				or(this.distanceTextField.textProperty().isEmpty());
		 this.applyFilterButton.disableProperty().bind(disableAddBinding);
	 }

	 private void bindToViewModel() {
		 this.priceTextField.textProperty().bindBidirectional(this.viewmodel.priceRangeProperty(), new NumberStringConverter());
		 this.ratingTextField.textProperty().bindBidirectional(this.viewmodel.ratingRangeProperty(), new NumberStringConverter());
		 this.distanceTextField.textProperty().bindBidirectional(this.viewmodel.distanceProperty(), new NumberStringConverter());
		 this.resturantListView.itemsProperty().bind(this.viewmodel.resturantListProperty());
		 this.menuTextArea.textProperty().bindBidirectional(this.viewmodel.menuDetailProperty());
		 this.resturantTextArea.textProperty().bindBidirectional(this.viewmodel.restaurantDetailProperty());
	 }

	 @FXML
	 void handleApplyFilters(ActionEvent event) {
		 this.viewmodel.applyFilters();
	 }

	 @FXML
	 void handleLoadAllResturants(ActionEvent event) {
		 this.viewmodel.loadFile();
	 }

	 @FXML
	 void handleResetFilter(ActionEvent event) {
		 this.viewmodel.resetFilters();
	 }
	 
	 @FXML
	 void handleSelectRandomRestaurant(ActionEvent event) {
		 this.viewmodel.selectRandomRestaurant();
	 }
}
