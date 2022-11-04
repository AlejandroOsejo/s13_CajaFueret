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

public class PasswordController {
    //ChangePasswordController changePasswordController = new ChangePasswordController();
    String password = "";
    String verificatePassword = "";


    @FXML
    private PasswordField onePF;

    @FXML
    private PasswordField threePF;

    @FXML
    private PasswordField fivePF;

    @FXML
    private PasswordField twoPF;

    @FXML
    private PasswordField fourPF;

    @FXML
    private PasswordField sixPF;

    @FXML
    private HBox boxHBox;

    @FXML
    void openSafeBox(ActionEvent event) {
        login();
    }

    public void login(){

        /*if(verificatePassword != null){
            verificatePassword = "000000";
        }
        
         */

        for (Node node : boxHBox.getChildren()){
            TextField tf = (TextField) node;
            password += tf.getText();
        }

        if (password.equalsIgnoreCase(verificatePassword)){
            SafeBoxMain.showWindow("contests-safebox.fxml");
            Stage currentStage =(Stage)boxHBox.getScene().getWindow();
            currentStage.hide();// se le pone hide para ocultar la ventana, y no se le pone close porque con close se cierra todo el programa
        }else {
            Alert alert= new Alert(Alert.AlertType.ERROR);

            onePF.setText("");
            twoPF.setText("");
            threePF.setText("");
            fourPF.setText("");
            fivePF.setText("");
            sixPF.setText("");

            alert.setTitle("CONTRASEÑA INCORRECTA");
            alert.setHeaderText("ESTAS TRATANDO DE ROBARNOS INFO????");
            alert.setContentText("Escribiste mal la contraseña o eres un ladron");

            alert.showAndWait();
        }
    }

    @FXML
    void onkey(KeyEvent event) {
        if (event.getSource().equals(onePF)){
            twoPF.requestFocus();
        }
        if (event.getSource().equals(twoPF)){
            threePF.requestFocus();
        }
        if (event.getSource().equals(threePF)){
            fourPF.requestFocus();
        }
        if (event.getSource().equals(fourPF)){
            fivePF.requestFocus();
        }
        if (event.getSource().equals(fivePF)){
            sixPF.requestFocus();
        }
        if (event.getSource().equals(sixPF)){
            onePF.requestFocus();
            //Se quiere lograr que apenas termine de escribir la contraseña, entonces que ingrese
            login();

        }
    }
}