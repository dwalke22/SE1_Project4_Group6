package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	private static final String WINDOW_TITLE = "Restaurant Picker";
	private static final String GUI_FXML = "/edu/westga/cs3211/project4/View/GUI.fxml";
	
	/**
	 * Constructs a new Application object for the Restaurant Picker
	 * 
	 * @precondition none
	 * @postcondition the object is ready to execute
	 */
	public Main() {
		super();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pane = this.loadGui();
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setTitle(WINDOW_TITLE);
			primaryStage.show();
		} catch(IllegalStateException | IOException anException) {
			anException.printStackTrace();
		}
	}
	
	private Pane loadGui() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource(GUI_FXML));
		return (Pane) loader.load();
	}
	/**
	 * Launches the application
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param args
	 * 			not used
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
