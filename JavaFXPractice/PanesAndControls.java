/*
연습문제: 다음과 같은 GUI를 만들어보세요.
- BorderPane 생성
    - Top: TextField
    - Bottom: Button
    - Center: Label
    - Right: VBox 안에 CheckBox 2개
*/

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class PanesAndControls extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        TextField textField = new TextField();
        textField.setPromptText("Enter something...");

        Button button = new Button("Submit");

        Label label = new Label("Label");

        CheckBox checkBox1 = new CheckBox();
        CheckBox checkBox2 = new CheckBox();
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(checkBox1, checkBox2);

        pane.setTop(textField);
        pane.setBottom(button);
        pane.setCenter(label);
        pane.setRight(vbox);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("PanesAndControls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
