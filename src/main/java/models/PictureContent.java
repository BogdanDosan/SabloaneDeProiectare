package models;

import ij.ImagePlus;
import org.openimaj.image.DisplayUtilities;
import org.openimaj.image.MBFImage;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PictureContent {
    private BufferedImage bufferedImage = null;
    //    private MBFImage mbfImage = null;
//    private ImagePlus imgPlusImage = null;
    public PictureContent(BufferedImage bufferedImage){
        this.bufferedImage = bufferedImage;
    }
    public BufferedImage getImage(){
        return bufferedImage;
    }
//    public PictureContent(MBFImage mbfImage){ this.mbfImage = mbfImage; }
//    public PictureContent(ImagePlus imgPlusImage){ this.imgPlusImage = imgPlusImage; }
//    public void print(){
//        if (bufferedImage != null){
//            JLabel picLabel = new JLabel(new ImageIcon(bufferedImage));
//            JPanel jPanel = new JPanel();
//            jPanel.add(picLabel);
//            JFrame f = new JFrame();
//            f.setSize(new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight()));
//            f.add(jPanel);
//            f.setVisible(true);
//        }
////        else if (mbfImage != null){
////            DisplayUtilities.display(mbfImage);
////        }
////        else if (imgPlusImage != null){
////            imgPlusImage.show();
////        }
//    }
}