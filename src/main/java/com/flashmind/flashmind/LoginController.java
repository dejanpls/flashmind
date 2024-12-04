package com.flashmind.flashmind;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
    @FXML
    private Label buttonText;

//    @FXML
//    protected void onLoginButtonClick() throws IOException {
//        buttonText.setText("Handle login!");
//        loadView("main-view.fxml");
//    }

    @FXML
    protected void onCancelButtonClick() throws IOException {
        loadView("welcome-view.fxml");
    }

    private void loadView(String fxmlFile) throws IOException {
        Stage stage = (Stage) buttonText.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
        stage.setScene(new Scene(root, 1100,700));
    }

}