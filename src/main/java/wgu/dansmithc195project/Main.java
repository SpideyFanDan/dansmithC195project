package wgu.dansmithc195project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    /*public static void main(String[] args) {
        *//**this try...catch function handles launching the dd and creating the connection*//*
        try {
            DBConnection.startConnection();
            launch(args);
            *//*this closes the database connection when the user exits the application *//*
            DBConnection.closeConnection();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }*/
}