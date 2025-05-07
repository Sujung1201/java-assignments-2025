/*
연습 문제: 마우스를 눌렀을 때 해당 좌표에 원(Circle)을 그려라
*/

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

public class PracticeMouseEvent extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Circle circle = new Circle(200, 150, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        pane.setOnMousePressed(e -> {
            pane.getChildren().add(circle);
        });

        Scene scene = new Scene(pane, 400, 300);

        primaryStage.setTitle("Make Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
