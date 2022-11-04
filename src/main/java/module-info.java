module com.example.s13_cajafuerte {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.s13_cajafuerte to javafx.fxml;
    exports com.example.s13_cajafuerte;
}