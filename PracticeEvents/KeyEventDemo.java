/*
예제 코드: `KeyEventDemo.java`
- **눌린 키**를 화면에 출력함.
- **방향키 (↑ ↓ ← →)** 를 눌러 객체(예: 원 또는 텍스트)를 이동시킴.
- 여기서도 `requestFocus()` 호출이 매우 중요함!
*/

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;

public class KeyEventDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(10, 20, "Enter key: ");
        Circle circle = new Circle(200, 100, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        Pane pane = new Pane();
        pane.getChildren().addAll(text, circle);

        pane.setOnKeyPressed(e -> {
            text.setText("Key pressed: " + e.getCode());

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
        primaryStage.setTitle("Move Circle with key event");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}
