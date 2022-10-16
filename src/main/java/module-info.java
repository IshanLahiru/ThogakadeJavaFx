module com.codercrope.thogakadecrudfull {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.codercrope.thogakadecrudfull to javafx.fxml;
    exports com.codercrope.thogakadecrudfull;
}