/*
연습 문제
1. 마우스를 눌렀을 때 해당 좌표에 원(Circle)을 그림.
2. 그리고 **화살표 키**로 그 원을 **이동**시킴.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;

public class PracticeKeyEvent extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        pane.setOnMousePressed(e -> {
            double x = e.getX();
            double y = e.getY();

            circle.setCenterX(x);
            circle.setCenterY(y);

            pane.getChildren().add(circle);
        });

        pane.setOnKeyPressed(e -> {
            double x = circle.getCenterX();
            double y = circle.getCenterY();

            if (e.getCode() == KeyCode.UP) {
                circle.setCenterY(y - 10);
            } else if (e.getCode() == KeyCode.DOWN) {
                circle.setCenterY(y + 10);
            } else if (e.getCode() == KeyCode.LEFT) {
                circle.setCenterX(x - 10);
            } else if (e.getCode() == KeyCode.RIGHT) {
                circle.setCenterX(x + 10);
            }
        });

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Practice Mouse And Key Event");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}
