package com.example.s13_cajafuerte;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ChangePasswordController {
    PasswordController pc = new PasswordController();
    String vPassword = pc.verificatePassword;


    @FXML
    private PasswordField newtwoPF;

    @FXML
    private PasswordField currentfourPF;

    @FXML
    private PasswordField currentfivePF;

    @FXML
    private PasswordField newonePF;

    @FXML
    private HBox newboxHBox;

    @FXML
    private PasswordField currentonePF;

    @FXML
    private PasswordField newthreePF;

    @FXML
    private PasswordField newsixPF;

    @FXML
    private HBox currentboxHBox;

    @FXML
    private PasswordField newfourPF;

    @FXML
    private PasswordField newfivePF;

    @FXML
    private PasswordField currentsixPF;

    @FXML
    private PasswordField currenttwoPF;

    @FXML
    private PasswordField currentthreePF;

    @FXML
    void chagePasswordBT(ActionEvent event) {
        String password = "";
        //String verificatePassword = "000000";
        for (Node node : currentboxHBox.getChildren()){
            TextField tf = (TextField) node;
            password += tf.getText();
        }
        if (password.equalsIgnoreCase(pc.verificatePassword)){
            SafeBoxMain.showWindow("contests-safebox.fxml");
            Stage currentStage =(Stage)currentboxHBox.getScene().getWindow();
            currentStage.hide();// se le pone hide para ocultar la ventana, y no se le pone close porque con close se cierra todo el programa
        }else {
            Alert alert= new Alert(Alert.AlertType.ERROR);

            currentonePF.setText("");
            currenttwoPF.setText("");
            currentthreePF.setText("");
            currentfourPF.setText("");
            currentfivePF.setText("");
            currentsixPF.setText("");

            alert.setTitle("CONTRASEÑA ACTUAL ES INCORRECTA");
            alert.setHeaderText("ERROR FATAL");
            alert.setContentText("Es posible que la contraseña este mal escrita");

            alert.showAndWait();
        }
        String newPassword = "";
        //String verificatePassword = "000000";
        for (Node node : newboxHBox.getChildren()){
            TextField tf = (TextField) node;
            newPassword += tf.getText();
        }
        vPassword = newPassword;

    }


    @FXML
    void closeBT(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();

        stage.close();

    }

    @FXML
    void onkeyCurrent(KeyEvent event) {
        if (event.getSource().equals(currentonePF)){
            currenttwoPF.requestFocus();
        }
        if (event.getSource().equals(currenttwoPF)){
            currentthreePF.requestFocus();
        }
        if (event.getSource().equals(currentthreePF)){
            currentfourPF.requestFocus();
        }
        if (event.getSource().equals(currentfourPF)){
            currentfivePF.requestFocus();
        }
        if (event.getSource().equals(currentfivePF)){
            currentsixPF.requestFocus();
        }
        if (event.getSource().equals(currentsixPF)){
            newonePF.requestFocus();
        }

    }
    @FXML
    void onkeyNew(KeyEvent event) {
        if (event.getSource().equals(newonePF)){
            newtwoPF.requestFocus();
        }
        if (event.getSource().equals(newtwoPF)){
            newthreePF.requestFocus();
        }
        if (event.getSource().equals(newthreePF)){
            newfourPF.requestFocus();
        }
        if (event.getSource().equals(newfourPF)){
            newfivePF.requestFocus();
        }
        if (event.getSource().equals(newfivePF)){
            newsixPF.requestFocus();
        }
    }

}
