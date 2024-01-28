package wgu.dansmithc195project.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

/**This controller handles the login screen*/
public class LoginScreenController {


    @FXML private Label locationLoginLabel;
    @FXML private Button loginButton;
    @FXML private Label loginErrorLabel;
    @FXML private Label passwordLabel;
    @FXML private TextField passwordTextBox;
    @FXML private Label titleLabel;
    @FXML private Label userNameLabel;
    @FXML private TextField userTextBox;
    @FXML
    public void clickLoginButton(ActionEvent event) {
        System.out.println("Login button clicked");

    }

}

