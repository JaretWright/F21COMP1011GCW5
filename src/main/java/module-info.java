module com.example.f21comp1011gcw5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens com.example.f21comp1011gcw5 to javafx.fxml;
    exports com.example.f21comp1011gcw5;
}