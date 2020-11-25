package view;

import edu.westga.cs3211.project4.model.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class GUICodeBehind {

	@FXML
    private ListView<Restaurant> resturantListView;

    @FXML
    private ComboBox<?> priceRangeComboBox;
    
    @FXML
    private ComboBox<?> distanceComboBox;

    @FXML
    private ComboBox<?> reviewScoreComboBox;
    
    @FXML
    private ComboBox<?> foodTypeComboBox;

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
