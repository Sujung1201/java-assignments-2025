import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class ShowCircleCentered extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        Pane pane = new Pane(circle);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ShowCircleCentered");
        primaryStage.show();
    }
}
