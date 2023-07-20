module com.example.fxgpt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxgpt to javafx.fxml;
    exports com.example.fxgpt;
}