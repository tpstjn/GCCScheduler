module com.scheduler.gccscheduler {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.scheduler.gccscheduler to javafx.fxml;
    exports com.scheduler.gccscheduler;
}