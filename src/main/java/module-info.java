module com.sysventas {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens com.sysventas to javafx.fxml;
    exports com.sysventas;
    exports com.sysventas.model;
    exports com.sysventas.enums;
}
