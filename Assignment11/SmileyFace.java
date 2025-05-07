import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Color;

public class SmileyFace extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle face = new Circle(200, 150, 100);
        face.setStroke(Color.BLACK);
        face.setFill(Color.YELLOW);

        Circle leftEye = new Circle(155, 120, 10);
        Circle rightEye = new Circle(245, 120, 10);

        Arc mouth = new Arc(200, 200, 60, 25, 180, 180);
        mouth.setFill(null);
        mouth.setStroke(Color.BLACK);

        Pane pane = new Pane(face, leftEye, rightEye, mouth);
        Scene scene = new Scene(pane, 400, 300);

        primaryStage.setTitle("Smiley Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
