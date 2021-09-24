package com.asigaka.r_keeper.controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.asigaka.r_keeper.Employee;
import com.asigaka.r_keeper.SceneLoader;
import com.asigaka.r_keeper.database.DbSettings;
import com.asigaka.r_keeper.database.DbStaff;
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
        DbSettings.FillDefaultSettings();

        ObservableList<String> positions = FXCollections.observableArrayList("Официант", "Администратор");
        postComboBox.setItems(positions);
        postComboBox.setValue("Официант");

        settingsButton.setOnAction(actionEvent -> {
            SceneLoader loader = new SceneLoader();
            loader.LoadSceneByName("settingsSample");
        });

        authorizationButton.setOnAction(actionEvent -> {
            DbStaff staff = new DbStaff();
            Employee employee = new Employee(nameField.getText(), passwordField.getText(), postComboBox.getValue());
            ResultSet result = staff.GetEmployee(employee);

            try {
                while (result.next()) {
                    System.out.println(result.getString(2));
                }
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });

        registerButton.setOnAction(actionEvent -> {
            DbStaff staff = new DbStaff();
            Employee employee = new Employee(nameField.getText(), passwordField.getText(), postComboBox.getValue());
            staff.RegisterEmployee(employee);
        });
    }
}
