package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private PasswordField PasswordField;

    @FXML
    private TextField UsernameField;

    @FXML
    void Login(MouseEvent event) {
       System.out.println("User: " + UsernameField.getText() + "\nPassword: " + PasswordField.getText());
    }

}
