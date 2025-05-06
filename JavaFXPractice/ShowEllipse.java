import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;

import java.util.Random;

public class ShowEllipse extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            double radiusX = rand.nextDouble() * 100;
            double radiusY = rand.nextDouble() * 80;

            double centerX = radiusX + rand.nextDouble() * (400 - 2 * radiusX);
            double centerY = radiusY + rand.nextDouble() * (300 - 2 * radiusY);

            int angle = rand.nextInt(360);

            double red = rand.nextDouble();
            double green = rand.nextDouble();
            double blue = rand.nextDouble();

            Ellipse ellipse = new Ellipse(centerX, centerY, radiusX, radiusY);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(Color.color(red, green, blue));
            ellipse.setRotate(angle);

            pane.getChildren().add(ellipse);
        }

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
