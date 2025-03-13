module com.employeemanagmentsystem.employeemanagmentsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires mysql.connector.j;
    requires java.desktop;

    opens com.employeemanagmentsystem.employeemanagmentsystem to javafx.fxml;
    exports com.employeemanagmentsystem.employeemanagmentsystem;
}