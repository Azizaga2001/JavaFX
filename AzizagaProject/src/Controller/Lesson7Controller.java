package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Lesson7Controller {

    @FXML
    private Button CheckButton;

    @FXML
    private TextField CodeField;

    @FXML
    void btnCheck(MouseEvent event) {
        String text = CodeField.getText();

        char[] Array = text.toCharArray();
        int[] Array1 = new int[Array.length];

        for (int i = 0; i < Array.length; i++) {
        	Array1[i] = Array[i] - '0';
        }

        int Nechet = 0;
        int Chet = 0;

        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
            	Nechet += Array1[i];
            } else {
            	Chet += Array1[i];
            }
        }

        int Sum = Nechet + Chet * 3;
        int LastInt = 10 - (Sum % 10);
        
        boolean Boolean = (LastInt == Array1[12]);

        System.out.println(Boolean);
    }
}
 
