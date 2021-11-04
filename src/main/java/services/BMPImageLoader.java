package services;
import models.PictureContent;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BMPImageLoader implements ImageLoader {
    public PictureContent load(String url){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(url));
            System.out.println("BMP image loaded!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new PictureContent(image);
    }