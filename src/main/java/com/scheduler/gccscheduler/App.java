package com.scheduler.gccscheduler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class App extends Application {
    public static ArrayList<Stage> stageval = new ArrayList<>();
    public static ArrayList<String> fxmlval = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800.0, 500.0);
        stage.setTitle("GCC Scheduler");
        stage.setScene(scene);
        fxmlval.add("login-view.fxml");
        stageval.add(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}