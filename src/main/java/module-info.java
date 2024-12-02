module com.example.agenziagui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.agenziagui to javafx.fxml;
    exports com.example.agenziagui;
}