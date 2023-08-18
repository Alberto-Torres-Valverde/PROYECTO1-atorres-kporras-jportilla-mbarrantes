module proyecto1.cuborubik {
    requires javafx.controls;
    requires javafx.fxml;

    opens proyecto1.cuborubik to javafx.fxml;
    exports proyecto1.cuborubik;
}
