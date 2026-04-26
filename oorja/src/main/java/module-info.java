module com.oorja {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oorja to javafx.fxml;
    exports com.oorja;
}