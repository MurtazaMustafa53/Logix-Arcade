package org.example.hellojavafx;

import javafx.animation.KeyFrame;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;


import java.io.IOException;
import java.security.Key;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;




    public void SwitchToScene1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scenes/Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(),600,600);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToScene2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scenes/Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(),600,600);
        stage.setScene(scene);
        stage.show();

    }

    public void SwitchToScene3(ActionEvent event, String score) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scenes/Scene3.fxml"));
        Parent root=fxmlLoader.load();
        Scene3Controller scenee = fxmlLoader.getController();
        scenee.setScore(score);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,600,600);
        stage.setScene(scene);
        stage.show();

    }


}
