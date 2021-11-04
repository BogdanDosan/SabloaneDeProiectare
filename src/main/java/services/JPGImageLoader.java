package services;

import models.PictureContent;
import org.openimaj.image.ImageUtilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class JPGImageLoader implements ImageLoader {
    public PictureContent load(String url){
//        MBFImage image = null;
        BufferedImage imageData = null;
        try{
//            image = ImageUtilities.readMBF(new File(url));
            imageData = ImageUtilities.createBufferedImageForDisplay(
                    ImageUtilities.readMBF(new File(url)));
            System.out.println("JPG image loaded!");
        } catch (IOException e){
            e.printStackTrace();
        }
        return new PictureContent(imageData);
    }


}