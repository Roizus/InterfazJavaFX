package control;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import view.Controller;

/**
 * Main de la Aplicacion 
 * @author Álvaro Roizo
 * @version 1.0
 */

public class MainApp extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;
	
	public MainApp() {}

	public static void main(String[] args) {
		launch(args);

	}
	
	/**
	 * Arranca la aplicacion
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;

		this.primaryStage.setTitle("Perfil GitHub");
		

		initRootLayout();
		primaryStage.setMaximized(false);
		
	}
	
	/**
	 * Genera la interfaz 
	 */
	public void initRootLayout() throws InvocationTargetException {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../view/VentanaPrincipal.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			

			
			// Give the controller access to the main app.
			Controller controller = loader.getController();
			controller.setMyGitHubProfile(this);
						
			primaryStage.show();

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Abre la otra ventana
	 */
	public void verVentana() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("../view/VentanaEmergente.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Registro");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			//dialogStage.initOwner(primaryStage);
			dialogStage.setResizable(false);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			dialogStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
