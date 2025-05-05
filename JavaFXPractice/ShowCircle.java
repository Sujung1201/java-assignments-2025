import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class ShowCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, 100, 100);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);

        Pane root = new Pane(circle);
        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
