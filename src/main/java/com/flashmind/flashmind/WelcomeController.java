package com.flashmind.flashmind;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class WelcomeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginButtonClick() throws IOException {
        welcomeText.setText("Handle login!");
        loadView("login-view.fxml");
    }

    @FXML
    protected void onRegisterButtonClick() throws IOException {
        welcomeText.setText("Handle registration!");
        loadView("register-view.fxml");
    }

    private void loadView(String fxmlFile) throws IOException {
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
        stage.setScene(new Scene(root, 1100, 700));
    }
}