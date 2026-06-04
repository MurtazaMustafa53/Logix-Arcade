package org.example.snake_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene0.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("logix Arcade Snake");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
    }



}
