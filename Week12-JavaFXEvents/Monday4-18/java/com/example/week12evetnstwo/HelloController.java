package com.example.week12evetnstwo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {
    private boolean xTurn = true;
    @FXML
    private Button btn;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Slider slider;

    @FXML
    private TextField textField;

    @FXML
    private Text txt00;

    @FXML
    private Text txt01;

    @FXML
    void txt00clicked(MouseEvent event) {
        System.out.println("txt00 was clicked!");

        if (xTurn) {
            txt00.setText("X");
            xTurn = false;
        } else {
            txt00.setText("O");
            xTurn = true;
        }
    }

    @FXML
    void txt01clicked(MouseEvent event) {
        System.out.println("txt01 was clicked!");
    }

    @FXML
    void textFieldClicked(MouseEvent event) {

    }

    @FXML
    void checkBoxClicked(MouseEvent event) {

    }
    @FXML
    void btnClicked(MouseEvent event) {
        String textFieldValue = textField.getText();
        boolean isChecked = checkBox.isSelected();

        btn.setText(textFieldValue + " " + isChecked);

        double button_x = btn.getLayoutX();
        double button_y = btn.getLayoutY();

        btn.setLayoutY(button_x-50);
    }

    @FXML
    void sliderDragged(MouseEvent event) {


        System.out.println("Something dragged!");

        double sliderVal = slider.getValue();

        if (sliderVal == 0) {
            txt00.setText("-");
            txt01.setText("-");
        }



    }

}
