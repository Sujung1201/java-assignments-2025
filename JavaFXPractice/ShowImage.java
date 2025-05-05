import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;



public class ShowImage extends Application {
    @Override
    public void start(Stage primaryStage) {
        Image image = new Image("https://fastly.picsum.photos/id/849/200/300.jpg?hmac=yxC3iWchW02fPkymErlcM6lg2lcTCKGxXh49nblSx9I");

        ImageView imageView1 = new ImageView(image);
        ImageView imageView2 = new ImageView(image);
        ImageView imageView3 = new ImageView(image);

        imageView1.setFitWidth(100);
        imageView1.setPreserveRatio(true);

        imageView2.setFitWidth(100);
        imageView2.setPreserveRatio(true);

        imageView3.setFitWidth(100);
        imageView3.setPreserveRatio(true);

        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(imageView1, imageView2, imageView3);

        Scene scene = new Scene(hbox, 400, 300);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
