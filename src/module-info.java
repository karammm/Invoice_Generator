module Invoice.Generator {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires sqlite.jdbc;

    opens com.karam.invoice;
}