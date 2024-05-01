module com.example.exchange {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exchange to javafx.fxml;
    exports com.example.exchange;
}