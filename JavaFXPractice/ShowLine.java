import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class ShowLine extends Application {
    @Override
    public void start(Stage primaryStage) {
        Line line1 = new Line();
        Line line2 = new Line();

        Pane pane = new Pane();
        pane.getChildren().addAll(line1, line2);

        line1.startXProperty().set(20);
        line1.startYProperty().set(20);
        line1.endXProperty().bind(pane.widthProperty().subtract(20));
        line1.endYProperty().bind(pane.heightProperty().subtract(20));

        line2.startXProperty().set(40);
        line2.startYProperty().set(30);
        line2.endXProperty().bind(pane.widthProperty().subtract(100));
        line2.endYProperty().bind(pane.heightProperty().subtract(50));

        Scene scene = new Scene(pane, 350, 350);

        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
