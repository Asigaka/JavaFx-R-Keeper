package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

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
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'sample.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'sample.fxml'.";
        assert postComboBox != null : "fx:id=\"postComboBox\" was not injected: check your FXML file 'sample.fxml'.";
        assert authorizationButton != null : "fx:id=\"authorizationButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert settingsButton != null : "fx:id=\"settingsButton\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
