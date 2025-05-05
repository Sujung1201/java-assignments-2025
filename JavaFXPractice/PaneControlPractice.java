import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

public class PaneControlPractice extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        Button button = new Button("OK");
        TextField textField = new TextField();
        pane.setTop(textField);
        Label label = new Label("Hello");
        pane.setCenter(label);

        VBox vbox = new VBox(5);
        CheckBox checkBox1 = new CheckBox("Option 1");
        CheckBox checkBox2 = new CheckBox("Option 2");
        vbox.getChildren().add(checkBox1);
        vbox.getChildren().add(checkBox2);
        pane.setRight(vbox);

        Scene scene = new Scene(pane);
        primaryStage.setScene((scene));
        primaryStage.setTitle("Pane Control Practice");
        primaryStage.show();
    }
}
