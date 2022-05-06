package com.scheduler.gccscheduler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import static com.scheduler.gccscheduler.App.fxmlval;
import static com.scheduler.gccscheduler.App.stageval;

public class LoginView {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void onLoginButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home-view.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        fxmlval.add("home-view.fxml");
        stageval.add(stage);
        stage.show();
    }

    @FXML
    protected void onGuestButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home-view.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        fxmlval.add("home-view.fxml");
        stageval.add(stage);
        stage.show();
    }

    @FXML
    protected void onRegisterButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("register-view.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        fxmlval.add("register-view.fxml");
        stageval.add(stage);
        stage.show();
    }
}
