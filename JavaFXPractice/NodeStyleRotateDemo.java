import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle1 = new Rectangle(200, 100);
        Rectangle rectangle2 = new Rectangle(200, 100);

        rectangle1.setFill(Color.color(1.0, 0.0, 0.0));
        rectangle1.setStroke(Color.BLACK);
        rectangle2.setFill(Color.YELLOW);
        rectangle2.setStroke(Color.BLACK);

        rectangle2.setRotate(45);

        StackPane pane1 = new StackPane(rectangle1);
        StackPane pane2 = new StackPane(rectangle2);;
        Scene scene = new Scene(pane1, 400, 300);
        Scene scene2 = new Scene(pane2, 400, 300);

        primaryStage.setTitle("rec1");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage secondStage = new Stage();
        secondStage.setTitle("rec2");
        secondStage.setScene(scene2);
        secondStage.show();
    }
}
