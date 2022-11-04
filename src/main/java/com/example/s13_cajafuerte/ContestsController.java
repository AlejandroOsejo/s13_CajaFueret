package com.example.s13_cajafuerte;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ContestsController implements Initializable {
    FileUtils fileUtils;

    FileInputStream input;
    FileOutputStream output;
    File file;


    public ContestsController() {

    }

    @FXML
    private TextArea infoTA;

    @FXML
    void chagePasswordBT(ActionEvent event) {
        SafeBoxMain.showWindow("ChangePassword-safebox.fxml");
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();

        saveText();

        stage.hide();
    }

    @FXML
    void closeBT(ActionEvent event) {
        saveText();


        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();

        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SafeBox current = FileData.getInstance().getSafeBox();
        //infoTA.setText("Hola usuario, este es su caja fuerte");
        FileUtils.openText("Caja Fuerte.txt");

    }

    /*public String openText(){
        File fileOpen = new File("Caja Fuerte.txt");
        String content = "";
        String line;

        try {
            input = new FileInputStream(fileOpen);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            while ((line = reader.readLine()) != null){
                content +=line;
            }
            input.close();
            infoTA.setText(content);

            Gson gson = new Gson();
            String[] text = gson.fromJson(content, String[].class);

            ArrayList<String> arrayText = new ArrayList<>();
            for (String t : text){
                arrayText.add(t);
                infoTA.setText(String.valueOf(arrayText));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

     */

    public void saveText() {
        Gson gson = new Gson();
        String content = gson.toJson(infoTA.getText());

        try {
            output = new FileOutputStream(new File("Caja Fuerte.txt"));
            byte[] contentbytes = content.getBytes(StandardCharsets.UTF_8);
            output.write(contentbytes);
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
