package wgu.dansmithc195project.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import wgu.dansmithc195project.controllers.LoginScreenController;

/** This is the controller for the opening screen. */
public class MainController implements Initializable {
    private  Stage stage;
    private Parent scene;

    @FXML private Button apptsButton;
    @FXML private Button contactButton;
    @FXML private Button exitButton;
    @FXML private Label locationLoginLabel;
    @FXML private Button loginButton;
    @FXML private Button reportsButton;
    @Override public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML void exitProgram(ActionEvent event) {

    }

    @FXML void openApptsScreen(ActionEvent event) {

    }

    @FXML void openContactsScreen(ActionEvent event) {

    }

    @FXML
    public void openLoginScreen(ActionEvent actionEvent) throws IOException {
//        System.out.println("login button clicked");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/wgu/dansmithc195project/views/LoginScreen.fxml"));
        stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
        scene = loader.load();
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML void openReportsScreen(ActionEvent event) {

    }
}