package Model;

import Controller.GameObject;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Banana implements GameObject {
    @Override
    public String objname() {
        return "banana";
    }

    @Override
    public Enum getObjectType() {
        return null;
    }

    @Override
    public int getXlocation() {
        return 0;
    }

    @Override
    public int getYlocation() {
        return 0;
    }

    @Override
    public int getMaxHeight() {
        return 0;
    }

    @Override
    public int getInitialVelocity() {
        return 0;
    }

    @Override
    public int getFallingVelocity() {
        return 0;
    }

    @Override
    public Boolean isSliced() {
        return null;
    }

    @Override
    public Boolean hasMovedOffScreen() {
        return null;
    }

    @Override
    public void slice() {

    }

    @Override
    public void move(double time) {

    }

    @Override
    public BufferedImage[] getBufferedImages() {
        BufferedImage[] images = new BufferedImage[1];
        images[0] = null;
        try {
            images[0] = ImageIO.read(new File("/pictures/banana.png"));
        } catch (IOException ex) {
            System.out.println("Image failed to load.");
        }
        return images;

    }

    @Override
    public Image toImage(BufferedImage[] bufferedImages) {
        Image image = SwingFXUtils.toFXImage(bufferedImages[0], null);
        return image;
    }

}
