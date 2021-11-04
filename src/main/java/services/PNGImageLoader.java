package services;

import models.PictureContent;
import services.ImageLoader;
import ij.IJ;

import java.awt.image.BufferedImage;

public class PNGImageLoader implements ImageLoader {
    public PictureContent load(String url){
//        ImagePlus image = null;
//        image = IJ.openImage(url);
        BufferedImage imageData = IJ.openImage(url).getBufferedImage();
        System.out.println("PNG image loaded!");
        return new PictureContent(imageData);
    }
}