package com.example.numberguessingfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {
    @FXML
    private Label output;
    @FXML
    private TextField inputField;
    @FXML
    private int input;
    @FXML
    private int random;

    @FXML
    protected void onStartButtonClick() {
        Random rd = new Random();
        random = rd.nextInt(10);
    }

    @FXML
    protected void onSubmitButtonClick() {
        input = Integer.parseInt(inputField.getText());
        if (input == random) {
            output.setText("Congratulations, you guessed correct number.");
        } else {
            output.setText("Unfortunately, you guessed wrong number.");
        }
    }
}