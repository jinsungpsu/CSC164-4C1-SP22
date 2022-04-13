package com.example.week11javafxintro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hi from CSC164 Monday 4/11!");
        stage.setScene(scene);
        stage.show();

        // Stage anotherStage = new Stage();
    }

    public static void main(String[] args) {
        launch();
    }
}