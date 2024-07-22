package wgu.dansmithc195project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ReportsController {

    @FXML private TableColumn numCustCountryCol;
    @FXML private TableColumn numCustDivisionCol;
    @FXML private TableColumn numCustomersCol;
    @FXML private Button backButton;
    @FXML private ComboBox<?> contactDropdown;
    @FXML private TableColumn customerIdCol;
    @FXML private TableColumn descriptionCol;
    @FXML private TableColumn endCol;
    @FXML private TableColumn idCol;
    @FXML private TableColumn numApptsCol;
    @FXML private TableColumn numApptsMonthCol;
    @FXML private TableColumn numApptsTypeCol;

    @FXML private TableColumn startCol;
    @FXML private TableView tableNumCustReport;
    @FXML private TableView tableNumApptsReport;
    @FXML private TableView tableScheduleReport;
    @FXML private TableColumn titleCol;
    @FXML private TableColumn typeCol;

    @FXML void onSelectContact(ActionEvent event) {

    }

}
