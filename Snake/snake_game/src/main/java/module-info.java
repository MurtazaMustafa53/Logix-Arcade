module org.example.snake_game {
    requires javafx.controls;
    requires javafx.fxml;
    // 🎯 REMOVED: javafx.web is gone to fix the jdk.jsobject error

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;


    requires com.almasb.fxgl.all;

    opens org.example.snake_game to javafx.fxml;
    exports org.example.snake_game;
}