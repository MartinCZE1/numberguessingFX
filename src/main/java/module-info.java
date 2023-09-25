module com.example.numberguessingfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numberguessingfx to javafx.fxml;
    exports com.example.numberguessingfx;
}