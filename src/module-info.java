module guru.bug.bullsandcows {
    requires javafx.controls;
    requires javafx.fxml;
    exports guru.bug.bullsandcows to javafx.graphics, javafx.fxml;
    opens guru.bug.bullsandcows to javafx.fxml, javafx.base;
}