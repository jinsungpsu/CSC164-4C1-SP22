module com.example.week11javafxintro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week11javafxintro to javafx.fxml;
    exports com.example.week11javafxintro;
}