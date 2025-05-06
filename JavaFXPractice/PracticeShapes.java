import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import java.util.Random;

public class PracticeShapes extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            double red = rand.nextDouble();
            double green = rand.nextDouble();
            double blue = rand.nextDouble();

            double radius = 10 + rand.nextDouble() * 90;
            double centerX = radius + rand.nextDouble() * (400 - 2 * radius);
            double centerY = radius + rand.nextDouble() * (300 - 2 * radius);

            Circle circle = new Circle(centerX, centerY, radius);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.color(red, green, blue));

            pane.getChildren().add(circle);
        }

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("PracticeShapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
