module com.example.premier_projet {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.premier_projet to javafx.fxml;
    exports com.example.premier_projet;
}