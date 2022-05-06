package com.scheduler.gccscheduler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BackButton {
    public void back(String instance, Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource(instance));
        Scene scene = new Scene(parent);
        scene.getStylesheets().add("/styles/base.css");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
