package wgu.dansmithc195project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerFormController {

    @FXML private Button backButton;
    @FXML private TextField customerAddressField;
    @FXML private ComboBox<?> customerCountryDropdown;
    @FXML private ComboBox<?> customerDivisionDropdown;
    @FXML private TextField customerID;
    @FXML private TextField customerNameField;
    @FXML private TextField customerPhoneField;
    @FXML private TextField customerPostalCodeField;
    @FXML private Label customerLabelError;
    @FXML private Button saveButton;
    @FXML void clickBackButton(ActionEvent event) {
    }

    @FXML
    void clickSaveButton(ActionEvent event) {

    }

}
