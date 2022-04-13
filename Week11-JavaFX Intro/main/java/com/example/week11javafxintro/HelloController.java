package com.example.week11javafxintro;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Text text;

    public HelloController() {
        System.out.println("A new object of class hello controller has been created!");
    }

    public void initialize() {
        btn1.setText("hola");

        text.setText("What's up!");
    }
}
