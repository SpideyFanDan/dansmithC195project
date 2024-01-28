module wgu.dansmithc195project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens wgu.dansmithc195project to javafx.fxml;
    exports wgu.dansmithc195project;
}