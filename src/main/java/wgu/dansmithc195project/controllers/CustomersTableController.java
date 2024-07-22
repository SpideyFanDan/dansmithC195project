package wgu.dansmithc195project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
/**This controller handles all customer table properties and actions*/
public class CustomersTableController {

    @FXML private Button addCustomerButton;
    @FXML private TableColumn<?, ?> addressColumn;
    @FXML private Button backButton;
    @FXML private TableColumn<?, ?> countryColumn;
    @FXML private TableColumn<?, ?> customerIDColumn;
    @FXML private TableColumn<?, ?> customerNameColumn;
    @FXML private TableView<?> customerTable;
    @FXML private Button deleteCustomerButton;
    @FXML private TableColumn<?, ?> divisionColumn;
    @FXML private Button editCustomerButton;
    @FXML private TableColumn<?, ?> phoneNumberColumn;
    @FXML private TableColumn<?, ?> postalCodeColumn;


    @FXML void clickBackButton(ActionEvent event) {

    }

    public void addCustomer(ActionEvent event) {
    }

    public void editCustomer(ActionEvent event) {
    }

    public void deleteCustomer(ActionEvent event) {
    }
}