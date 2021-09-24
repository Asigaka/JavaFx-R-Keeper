package com.asigaka.r_keeper.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.asigaka.r_keeper.SceneLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthorizationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ComboBox<?> postComboBox;

    @FXML
    private Button authorizationButton;

    @FXML
    private Button settingsButton;

    @FXML
    void initialize() {
        settingsButton.setOnAction(actionEvent -> {
            //settingsButton.getScene().getWindow().hide();

            SceneLoader loader = new SceneLoader();
            loader.LoadSceneByName("settingsSample");
        });
    }
}
