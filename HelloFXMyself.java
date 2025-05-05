import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class HelloFXMyself extends Application{
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("HelloFX");
        BorderPane pane = new BorderPane();
        pane.setCenter(button);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}