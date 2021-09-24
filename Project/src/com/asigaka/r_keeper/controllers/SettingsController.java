package com.asigaka.r_keeper.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.asigaka.r_keeper.SceneLoader;
import com.asigaka.r_keeper.database.DbHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    void initialize() {
        backButton.setOnAction(actionEvent -> {
            backButton.getScene().getWindow().hide();
        });

        connectButton.setOnAction(actionEvent -> {
            //connectButton.getScene().getWindow().hide();
            DbConnect();
        });
    }

    private void DbConnect() {
        DbHandler handler = new DbHandler();
        handler.FillSettings(hostField.getText(), portField.getText(), usernameField.getText(), passwordField.getText());

        if (handler.GetConnection() != null) {
            urlLabel.setText("Вы подключились к " + handler.getDb_url());
        }
        else {
            urlLabel.setText("Подключение не удалось");
        }
    }
}

