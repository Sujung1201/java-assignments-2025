import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class CalculateBMI extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label textWeight = new Label("Enter weight: ");
        TextField textFieldWeight = new TextField();
        Label textHeight = new Label("Enter height: ");
        TextField textFieldHeight = new TextField();
        Label text = new Label("Imperial Units:");
        CheckBox box = new CheckBox();
        Button btn = new Button("Click Calculation");
        Label label = new Label();

        btn.setOnAction(e -> {
            try {
                double weight = Double.parseDouble(textFieldWeight.getText());
                double height = Double.parseDouble(textFieldHeight.getText());

                if (box.isSelected()) {
                    double bmi = weight * 703 / (height * height);
                    label.setText(String.format("Result: %.2f", bmi));
                } else {
                    double bmi = weight / (height * height);
                    label.setText(String.format("BMI: %.2f", bmi));
                }
            } catch (NumberFormatException exception) {
                label.setText("Please enter valid number.");
            }
        });

        HBox hbox = new HBox(10, text, box);
        VBox pane = new VBox(textWeight, textFieldWeight,
                textHeight, textFieldHeight, hbox, btn, label);
        pane.setPadding(new Insets(10));

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Calculate BMI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
