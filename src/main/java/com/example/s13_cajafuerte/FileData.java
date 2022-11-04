package com.example.s13_cajafuerte;

public class FileData {
    //Formato del singleton
    private static FileData instance;
    private void FileOpenerData(){
        safeBox = new SafeBox("","");
    }
    public static FileData getInstance(){
        if(instance == null){
            instance = new FileData();
        }
        return instance;
    }
    //Los atributos de la clase
    public SafeBox safeBox;

    public SafeBox getSafeBox() {
        return safeBox;
    }

    public void setSafeBox(SafeBox safeBox) {
        this.safeBox = safeBox;
    }
}
