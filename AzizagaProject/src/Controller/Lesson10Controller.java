package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Lesson10Controller {

    @FXML
    private TextField NameField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private ProgressBar ProgressBar;

    @FXML
    private TextField UsernameField;

    @FXML
    void ResultBtn(MouseEvent event) {
    	if (NameField.getText().isEmpty()) {
    	    System.out.println("TextField пуст!");
    	} else {
    	    ProgressBar.setProgress(0.30);
    	}
    	
    	if (UsernameField.getText().isEmpty()) {
    	    System.out.println("TextField пуст!");
    	} else {
    	    ProgressBar.setProgress(0.60);
    	}
    	
    	if (PasswordField.getText().isEmpty()) {
    	    System.out.println("TextField пуст!");
    	} else {
    	    ProgressBar.setProgress(1);
    	}
         
    }
}