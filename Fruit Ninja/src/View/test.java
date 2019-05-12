package View;

import Controller.GameActions;
import Controller.GameObject;
import Model.Watermelon;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.image.BufferedImage;
import java.util.List;

public class test extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("Welcome to RiverCrossing Game");
            Group root1 = new Group();
            Scene scene1 = new Scene(root1);
            primaryStage.setScene(scene1);
            Canvas canvas1 = new Canvas(1300, 700);
            GraphicsContext graphics1 = canvas1.getGraphicsContext2D();
            Watermelon watermelon = new Watermelon();
            BufferedImage x[] = watermelon.getBufferedImages();
            root1.getChildren().add(canvas1);
            Image goatImg = watermelon.toImage(x);
            Image background = new Image(getClass().getResource("/pictures/bg-hd.png").toExternalForm());
            graphics1.drawImage(background, 0, 0);
            graphics1.drawImage(goatImg,50,50);
            //Image fruit = new Image(getClass().getResource("/pictures/pineapple.png").toExternalForm());
            //graphics1.drawImage(fruit,50,50);
            ImageView imFruit = new ImageView(new Image(getClass().getResource("/pictures/pineapple.png").toExternalForm()));
            root1.getChildren().add(imFruit);
            TranslateTransition transition = new TranslateTransition(Duration.millis(2000),imFruit);
            transition.setByX(100);
            transition.play();

            primaryStage.show();

        }

    public static void main(String[] args) {
        launch(args);
    }

    }

