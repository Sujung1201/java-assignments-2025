/*
연습 문제: 다음 기능을 하는 프로그램을 만들어보세요
- **원(Circle)** 하나와 **버튼** 두 개 생성
- 첫 번째 버튼 클릭 시: 원의 채우기 색을 **파란색**으로 변경
- 두 번째 버튼 클릭 시: 원의 채우기 색을 **빨간색**으로 변경
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Scene;

public class PracticeEventDriven extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        Circle circle = new Circle(200, 100, 100);
        Button btn1 = new Button("Change blue");
        Button btn2 = new Button("Change red");

        circle.setStroke(Color.BLACK);

        btn1.setOnAction(e -> circle.setFill(Color.BLUE));
        btn2.setOnAction(e -> circle.setFill(Color.RED));

        pane.setCenter(circle);
        HBox hbox = new HBox(10, btn1, btn2);
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER);
        pane.setBottom(hbox);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("PracticeEventDriven");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
