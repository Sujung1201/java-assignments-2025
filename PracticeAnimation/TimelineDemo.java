/*
TimelineDemo.java
- 500ms마다 작동하는 키프레임 생성(원이 점점 오른쪽으로 움직임)
- 마우스를 클릭하면 애니메이션 시작 / 멈춤
*/

import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class TimelineDemo extends Application {
    @Override
    public void start(Stage primaryStage) {

        Circle circle = new Circle(0, 150, 20);

        KeyFrame move = new KeyFrame(Duration.seconds(0.5), e -> {
            circle.setCenterX(circle.getCenterX() + 10);
        });

        Timeline tl = new Timeline(move);
        tl.setCycleCount(20);
        tl.play();

        Pane pane = new Pane(circle);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Timeline Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
