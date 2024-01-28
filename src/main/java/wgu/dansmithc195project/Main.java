package wgu.dansmithc195project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import wgu.dansmithc195project.utils.JDBC;


import java.io.*;

/**Main class that launches the application's main screen*/
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/MainScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("C195 Project");
        stage.setScene(scene);
        stage.show();
    }

/**@param args arguments for the command line*/
    public static void main(String[] args) {
        JDBC.startConnection();
    }
}