package model;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Programm extends Application {

	@Override 
	public void start(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/gui/NewFile.xml")); 
		Scene scene = new Scene(root);
		stage.setTitle("Text encoder");
		stage.setScene(scene);        
		stage.show();    
		}


	public static void main(String[] parameters) {       
		launch(parameters);   
	}


}