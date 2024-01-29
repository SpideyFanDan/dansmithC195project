module wgu.dansmithc195project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens wgu.dansmithc195project to javafx.fxml;
    exports wgu.dansmithc195project;
    exports wgu.dansmithc195project.controllers;
    opens wgu.dansmithc195project.controllers to javafx.fxml;
}