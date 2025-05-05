import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import java.util.Random;

public class RandomCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Random rand = new Random();
        Pane pane = new Pane();

        int sceneWidth = 800;
        int sceneHeight = 600;

        for (int i = 0; i < 20; i++) {
            double radius = 10 + rand.nextDouble() * (100 - 10);
            double red = rand.nextDouble();
            double green = rand.nextDouble();
            double blue = rand.nextDouble();

            double x = radius + rand.nextDouble() * (sceneWidth - 2 * radius);
            double y = radius + rand.nextDouble() * (sceneHeight - 2 * radius);

            Circle circle = new Circle(x, y, radius);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.color(red, green, blue));

            pane.getChildren().add(circle);
        }

        Scene scene = new Scene(pane, sceneWidth, sceneHeight);

        primaryStage.setTitle("RandomCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
