package com.slkrk.spellbinder.client;

//import com.sun.javafx.util.Logging;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
//import java.util.logging.Logger;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{




        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("spellbinder.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("spellbinder.fxml"));



        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }



}
