package wgu.dansmithc195project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class AppointmentsTableController {

    @FXML private Button addApptButton;
    @FXML private TableColumn<?, ?> apptContactColumn;
    @FXML private TableColumn<?, ?> apptDescriptionColumn;
    @FXML private TableColumn<?, ?> apptEndColumn;
    @FXML private TableColumn<?, ?> apptIdColumn;
    @FXML private TableColumn<?, ?> apptLocationColumn;
    @FXML private TableColumn<?, ?> apptStartColumn;
    @FXML private TableColumn<?, ?> apptTitleColumn;
    @FXML private TableColumn<?, ?> apptTypeColumn;
    @FXML private Button backButton;
    @FXML private TableColumn<?, ?> customerIDColumn;
    @FXML private Button deleteApptButton;
    @FXML private RadioButton radioButtonMonth;
    @FXML private RadioButton radioButtonWeek;
    @FXML private RadioButton radioNoFilter;
    @FXML private TableView<?> tableAppointments;
    @FXML private ToggleGroup toggleAppointments;
    @FXML private Button updateApptButton;
    @FXML private TableColumn<?, ?> userIdColumn;

    @FXML void addAppointment(ActionEvent event) {

    }

    @FXML void clickBackButton(ActionEvent event) {

    }

    @FXML void deleteAppointment(ActionEvent event) {

    }

    @FXML void updateAppointment(ActionEvent event) {

    }

    @FXML void viewAllAppointments(ActionEvent event) {

    }

    @FXML void viewCurrentMonth(ActionEvent event) {

    }

    @FXML void viewCurrentWeek(ActionEvent event) {

    }

}
