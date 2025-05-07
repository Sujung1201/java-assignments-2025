import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CircleArea extends Application {
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("Enter radius");
        TextField textField = new TextField();

        Label label = new Label();
        Button btn = new Button("Click the Calculation");

        btn.setOnAction(e -> {
            try {
                double radius = Double.parseDouble(textField.getText());
                double area = Math.PI * radius * radius;
                label.setText("Area: " + String.format("%.2f", area));
            } catch (NumberFormatException exception) {
                label.setText("Please enter a valid number.");
            }
        });

        VBox pane = new VBox(10, text, textField, btn, label);
        pane.setPadding(new Insets(10));
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Circle Area");
        primaryStage.show();
    }
}
