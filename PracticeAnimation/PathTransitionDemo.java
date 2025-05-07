/*
PathTransitionDemo.java`
    - 원(Circle)을 path로, 사각형(Rectangle)을 node로 설정
    - 사각형이 원을 따라 회전
    - `autoReverse`로 자동 되감기, `cycleCount = INDEFINITE`로 무한 반복
*/

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.animation.PathTransition;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.scene.layout.Pane;

public class PathTransitionDemo extends Application{
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(200, 150, 100);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);

        Rectangle rectangle = new Rectangle(0, 0, 20, 20);
        rectangle.setFill(Color.RED);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.seconds(5));
        pt.setNode(rectangle);
        pt.setPath(circle);
        pt.setAutoReverse(true);
        pt.setCycleCount(Animation.INDEFINITE);

        pt.play();

        Pane pane = new Pane(circle, rectangle);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("PathTransitionDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}