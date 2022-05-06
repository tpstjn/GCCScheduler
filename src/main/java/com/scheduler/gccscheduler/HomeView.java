package com.scheduler.gccscheduler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import static com.scheduler.gccscheduler.App.fxmlval;
import static com.scheduler.gccscheduler.App.stageval;

public class HomeView {

    @FXML
    private MenuButton btnUserMenu;
    @FXML
    private Label pageLabel;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void initialize() {
        pageLabel.setText("Home");
    }

    @FXML
    protected void onLogoutButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
        stage = (Stage) btnUserMenu.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        fxmlval.add("login-view.fxml");
        stageval.add(stage);
        stage.show();
    }

    @FXML
    protected void onEditButtonClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("edit-view.fxml")));
        stage = (Stage) btnUserMenu.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        fxmlval.add("edit-view.fxml");
        stageval.add(stage);
        stage.show();
    }

    @FXML
    public void onCreateScheduleClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scheduler-view.fxml")));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        fxmlval.add("scheduler-view.fxml");
        stageval.add(stage);
        stage.show();
    }
}
