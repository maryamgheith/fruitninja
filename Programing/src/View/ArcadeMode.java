package View;

import Controller.FruitFactory;
import Controller.GameObject;
import Model.level1GameActions;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.List;
import java.util.Random;

public class ArcadeMode {
    public Scene getscene (){
        Group root =new Group();
        Scene scene =new Scene(root);
        Canvas canvas = new Canvas(1350, 735);
        root.getChildren().add(canvas);
        Random random = new Random();
        int x = random.nextInt(6)+1;
        int i=0;
        while(i!=x) {
            GraphicsContext graphics = canvas.getGraphicsContext2D();
            Image background = new Image(getClass().getResource("BG2.jpg").toExternalForm());
            graphics.drawImage(background, 0, 0);
            level1GameActions level1GameActions = new level1GameActions();
            level1GameActions.createGameObject(graphics);
            level1GameActions.setFruits(level1GameActions.getFruits());
            PauseTransition pauseTransition = new PauseTransition(Duration.millis(500));
            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(2000));
            TranslateTransition translateTransition1 = new TranslateTransition(Duration.millis(1000));
            FruitFactory fruitFactory = new FruitFactory();
            GameObject fruits = fruitFactory.getFruits();
            ImageView im = new ImageView(fruits.toImage());
            translateTransition.setNode(im);
            root.getChildren().add(im);
            translateTransition1.setNode(im);
            translateTransition.setFromY(750);
            translateTransition.setToY(0);
            translateTransition.setFromX(level1GameActions.getX());
            translateTransition1.setFromY(0);
            translateTransition1.setToY(750);
            translateTransition1.setFromX(level1GameActions.getX());
            SequentialTransition seq = new SequentialTransition(pauseTransition,translateTransition, translateTransition1);
            seq.play();
            level1GameActions.setX(level1GameActions.getX()+100);
            im.setOnMouseClicked(event -> {
                im.setVisible(false);
                System.out.println("Visible");
            });

            i++;
        }
        return scene;
    }
}
