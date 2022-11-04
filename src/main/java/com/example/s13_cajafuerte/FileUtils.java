package com.example.s13_cajafuerte;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {
    public static String openText(String path){
        StringBuilder input = new StringBuilder();
        File f = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String line;
            while( (line = reader.readLine()) != null ){
                input.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input.toString();
    }

    /*public static String saveText(String path, String content){
        FileOutputStream output;

        String text;
        Gson gson = new Gson();
        String content = gson.toJson(cc.);

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
        return text;
    }

     */

}