package com.example.s13_cajafuerte;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SafeBoxMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showWindow("password-safebox.fxml");
    }

    public static void showWindow(String fxml) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader((SafeBoxMain.class.getResource(fxml)));

            Parent node = fxmlLoader.load();
            Scene scene = new Scene(node);
            Stage window = new Stage();
            window.setScene(scene);
            window.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}