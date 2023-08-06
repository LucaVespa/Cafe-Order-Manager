package com.example.rucafe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * This class executes the program and opens the main window for the application.
 * @author Luca Vespa
 */
public class RUCafeMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RUCafeMain.class.getResource("RUCafe-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 800);
        stage.setTitle("RU Cafe");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        RUCafeController ruCafeController = fxmlLoader.getController();
        stage.setOnCloseRequest(event -> {
            ruCafeController.closeAllTabs();
        });

    }

    public static void main(String[] args) {
        launch();
    }
}