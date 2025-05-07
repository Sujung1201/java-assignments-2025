import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import java.util.Random;

public class RandomCircles extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int radius = rand.nextInt(100);

            double x = radius + rand.nextDouble() * (300 - 2 * radius);
            double y = radius + rand.nextDouble() * (300 - 2 * radius);

            double red = rand.nextDouble();
            double green = rand.nextDouble();
            double blue = rand.nextDouble();

            Circle circle = new Circle(x, y, radius);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.color(red, green, blue));

            pane.getChildren().add(circle);
        }

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Random Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
