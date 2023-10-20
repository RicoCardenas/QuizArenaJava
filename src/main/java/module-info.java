module com.identproyect.quizarena {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires javafx.swing;

    opens com.identproyect.quizarena to javafx.fxml;
    exports com.identproyect.quizarena;
}