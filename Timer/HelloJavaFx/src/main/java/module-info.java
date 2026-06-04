module org.example.hellojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;
    requires jdk.unsupported.desktop;


    opens org.example.hellojavafx to javafx.fxml;
    exports org.example.hellojavafx;
}