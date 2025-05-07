import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;

public class MovingCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(200, 150, 20);
        circle.setFill(Color.RED);

        circle.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                circle.setCenterY(circle.getCenterY() - 10);
            } else if (e.getCode() == KeyCode.DOWN) {
                circle.setCenterY(circle.getCenterY() + 10);
            } else if (e.getCode() == KeyCode.LEFT) {
                circle.setCenterX(circle.getCenterX() - 10);
            } else if (e.getCode() == KeyCode.RIGHT) {
                circle.setCenterX(circle.getCenterX() + 10);
            }
        });

        Pane pane = new Pane(circle);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Moving Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

        circle.requestFocus();
    }
}
