module com.example.week12evetnstwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week12evetnstwo to javafx.fxml;
    exports com.example.week12evetnstwo;
}