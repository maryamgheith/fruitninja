package View;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ArcadeMode {
    public Scene getscene (){
        Group root =new Group();
        Scene scene =new Scene(root);
        Canvas canvas = new Canvas(1350, 735);
        root.getChildren().add(canvas);
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        Image background = new Image(getClass().getResource("BG2.jpg").toExternalForm());
        graphics.drawImage(background, 0, 0);

        return scene;
    }
}
