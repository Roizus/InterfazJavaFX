package view;

import java.io.IOException;

import control.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Controlador de la clase
 * 
 * @author Álvaro Roizo
 * @version 1.0
 */
public class Controller {
	MainApp mygithubProfile;
	private Stage dialogStage;
	
	@FXML
    private BorderPane mainBorderPane;
	
	@FXML
    private ImageView imagenPerfil;
	
	
	@FXML
    private void initialize() {
    	
    }
	
	/**
	 * Abre una nueva ventana
	 *  
	 */
	@FXML
    public void nuevaVentana() {
        mygithubProfile.verVentana();      
    }

	
	public void setMyGitHubProfile(MainApp myGitHub) {
		this.mygithubProfile = myGitHub;
	}
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
        this.dialogStage.centerOnScreen();
        this.dialogStage.setResizable(false);
        
    }
}
