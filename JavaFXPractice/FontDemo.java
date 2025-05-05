import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;


public class FontDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100);
        Label label = new Label("FontDemo");
        label.setFont(new Font("Times New Roman", 24));

        StackPane pane = new StackPane(circle);
        pane.getChildren().add(label);
        Scene scene = new Scene(pane, 400, 300);

        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
