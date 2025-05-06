import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import java.util.Random;

public class ShowRectangle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            double width = 20 + rand.nextDouble() * 30;
            double height = 30 + rand.nextDouble() * 40;
            double x = rand.nextDouble() * (400 - width);
            double y = rand.nextDouble() * (300 - width);
            int angle = rand.nextInt(180);

            double red = rand.nextDouble();
            double green = rand.nextDouble();
            double blue = rand.nextDouble();

            Rectangle rec = new Rectangle(x, y, width, height);
            rec.setRotate(angle);
            rec.setStroke(Color.BLACK);
            rec.setFill(Color.color(red, green, blue));

            pane.getChildren().add(rec);
        }

        Scene scene = new Scene(pane,400, 300);

        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
