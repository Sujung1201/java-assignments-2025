/*
예제 코드: `MouseEventDemo.java`
- 텍스트를 드래그하면 위치가 이동됨.
- 람다 표현식으로 이벤트 핸들러 작성하는 또 다른 방법을 보여줌.
- 이벤트 핸들러를 등록할 때 람다식 사용.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Text;


public class MouseEventDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("Drag Me");

        text.setX(200);
        text.setY(150);

        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });

        Pane pane = new Pane(text);
        Scene scene = new Scene(pane, 400, 300);

        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
