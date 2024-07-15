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
import wgu.dansmithc195project.DOA.UserDAOImpl;

/** This controller handles the login screen allowing the user to access the program by entering a valid username
 * and password
 */
public class LoginScreenController {
    private Stage stage;
    private Scene scene;

    /**This is the reset button*/
    public Button resetButton;

    /**This is the location/time zone label*/
    public Label locationLoginLabel;

    /**This is the login button*/
    public Button loginButton;

    /**This is the error message*/
    public Label loginErrorLabel;

    /**This is the password label*/
    public Label passwordLabel;

    /**This is the password text field*/
    public TextField passwordTextBox;

    /**This is the username label*/
    public Label userNameLabel;

    /**This is the username text field*/
    public TextField userTextBox;

    /**This is the login method when the login button is clicked. This will also generate a log of login attempts based
     * on each attempt to login whether they are successful or unsuccessful. Each login attempt will append the
     * "login_activity.txt" file created in the program's root directory.
     */
    @FXML
    public void clickLoginButton(ActionEvent actionEvent) {
        System.out.println("Login button clicked");
        boolean userAuthenticated = false;
        String username = userTextBox.getText();
        String password = passwordTextBox.getText();
        if(UserDAOImpl.authenticateUser(username, password).size() == 0){
            System.out.println("username or password incorrect");
        }

    }

    public void clickResetButton(ActionEvent actionEvent) {
        System.out.println("Reset button clicked");
    }

}

