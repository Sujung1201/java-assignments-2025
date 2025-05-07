/*
FadeTransitionDemo.java
- 타원(Ellipse)의 투명도를 1.0에서 0.1까지 줄임
- `duration = 3000ms` (3초), `cycleCount = INDEFINITE` → 계속 반복
*/

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Ellipse e = new Ellipse(200, 150, 50, 25);

        FadeTransition ft = new FadeTransition();
        ft.setNode(e);
        ft.setFromValue(1);
        ft.setToValue(0.1);
        ft.setDuration(Duration.seconds(3));
        ft.setCycleCount(Animation.INDEFINITE);

        ft.play();

        Pane pane = new Pane(e);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Fade Transition Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
