package com.asigaka.r_keeper.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.asigaka.r_keeper.database.DbConnector;
import com.asigaka.r_keeper.database.DbSettings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class SettingsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField hostField;

    @FXML
    private TextField portField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label urlLabel;

    @FXML
    private Button connectButton;

    @FXML
    private Button backButton;

    @FXML
    private Circle circleColor;

    DbConnector handler;

    @FXML
    void initialize() {
        handler = new DbConnector();

        CheckConnection();

        backButton.setOnAction(actionEvent -> {
            backButton.getScene().getWindow().hide();
        });

        connectButton.setOnAction(actionEvent -> {
            DbConnect();
        });
    }

    private void DbConnect() {
        DbSettings.FillSettings(hostField.getText(), portField.getText(), usernameField.getText(), passwordField.getText());

        CheckConnection();
    }

    private void CheckConnection() {
        if (handler.GetConnection() != null) {
            circleColor.setFill(Paint.valueOf("green"));
            urlLabel.setText("Вы подключены к " + DbSettings.DB_URL);
        }
        else {
            circleColor.setFill(Paint.valueOf("red"));
            urlLabel.setText("Подключение отсутствует");
        }
    }
}

