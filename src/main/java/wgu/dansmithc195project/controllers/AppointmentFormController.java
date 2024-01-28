package wgu.dansmithc195project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppointmentFormController {

    @FXML private TextField apptDescriptionField;
    @FXML private TextField apptIDField;
    @FXML private TextField apptLocationField;
    @FXML private TextField apptTitleField;
    @FXML private TextField apptTypeField;
    @FXML private Button cancelButton;
    @FXML private ComboBox<?> contactDropdown;
    @FXML private ComboBox<?> customerDropdown;
    @FXML private DatePicker dateEndSelection;
    @FXML private DatePicker dateStartSelection;
    @FXML private ComboBox<?> endTimeDropdown;
    @FXML private Label errorLabel;
    @FXML private Button saveButton;
    @FXML private ComboBox<?> startTimeDropdown;
    @FXML private Label timeErrorLabel;
    @FXML private ComboBox<?> userDropdown;

    @FXML void clickCancelButton(ActionEvent event) {

    }

    @FXML void clickSaveButton(ActionEvent event) {

    }

}
