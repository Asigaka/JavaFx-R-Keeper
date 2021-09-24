package com.asigaka.r_keeper.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.asigaka.r_keeper.SceneLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private ComboBox<String> postComboBox;

    @FXML
    private Button authorizationButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button registerButton;

    @FXML
    void initialize() {
        settingsButton.setOnAction(actionEvent -> {
            //settingsButton.getScene().getWindow().hide();

            SceneLoader loader = new SceneLoader();
            loader.LoadSceneByName("settingsSample");
        });

        ObservableList<String> positions = FXCollections.observableArrayList("Официант", "Администратор");
        postComboBox.setItems(positions);
        postComboBox.setValue("Официант"); // устанавливаем выбранный элемент по умолчанию

        authorizationButton.setOnAction(actionEvent -> {
        });

        registerButton.setOnAction(actionEvent -> {
        });
    }
}
