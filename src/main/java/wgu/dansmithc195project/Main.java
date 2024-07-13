package wgu.dansmithc195project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import wgu.dansmithc195project.utils.JDBC;
import java.io.*;

/**Main class*/
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("System loaded");
        Parent root = FXMLLoader.load(getClass().getResource("/wgu/dansmithc195project/views/LoginScreen.fxml"));
//        Scene scene = new Scene(root);
        stage.setTitle("C195 Project");
        stage.setScene(new Scene(root));
        stage.show();
    }
/**
 * This is the main method that launches the application's main screen and opens the db connection when the
 * program is run, then closes the connection when the program is closed
 * */
/**@param args arguments for the command line*/
    public static void main(String[] args) {
        JDBC.openConnection();
        launch(args);
        JDBC.closeConnection();
    }
}