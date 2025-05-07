/*
FlagRisingAnimation.java
- 직선을 `path`로, 이미지 뷰(ImageView)를 `node`로 사용
- 이미지를 **10초(duration=10000ms)** 동안 위로 올림
- `cycleCount = 5` → 애니메이션 5번 반복
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.PathTransition;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

public class FlagRisingAnimation extends Application {
    @Override
    public void start(Stage primaryStage) {
        Line line = new Line(200, 280, 200, 20);
        ImageView imageView = new ImageView(new Image("https://picsum.photos/200"));

        PathTransition pt = new PathTransition();
        pt.setPath(line);
        pt.setNode(imageView);
        pt.setDuration(Duration.seconds(10));
        pt.setCycleCount(5);

        pt.play();

        Pane pane = new Pane(line, imageView);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Flag Rising Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
