module com.flashmind.flashmind {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.flashmind.flashmind to javafx.fxml;
    exports com.flashmind.flashmind;
}