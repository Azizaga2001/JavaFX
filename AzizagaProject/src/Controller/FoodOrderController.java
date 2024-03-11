package Controller;

import Model.FoodOrder;
import Repository.Repository;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FoodOrderController {

    @FXML
    private ComboBox<?> CategoryComboBox;

    @FXML
    private DatePicker EndDatePicker;

    @FXML
    private TableView<?> FoodTableView;

    @FXML
    private DatePicker StartDatePicker;

    @FXML
    private TableColumn<?, ?> categoryColumn;

    @FXML
    private TableColumn<?, ?> endColumn;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField nameField;

    @FXML
    private TableColumn<?, ?> startColumn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    void DeleteButton(MouseEvent event) {

    }

    @FXML
    void SaveButton(MouseEvent event) {
    	FoodOrder selectedOrder = (FoodOrder) FoodTableView.getSelectionModel().getSelectedItem();
    	
    	if(selectedOrder == null) {
    		if(!nameField.getText().isEmpty() && !CategoryComboBox.getValue().getName.equals("Select Category")) {
    			FoodOrderRepository = new ();
    		}
    	}
    }

    @FXML
    void Update(MouseEvent event) {

    }

}
