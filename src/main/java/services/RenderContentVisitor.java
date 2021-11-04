package services;

import models.*;
import models.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class RenderContentVisitor implements models.Visitor {
    public void visitBook(Book b){
        System.out.println("Book: " + b.getTitle());
        System.out.println("Authors: ");
        for (Author auth : b.getAuthors()){
            auth.print();
        }
        System.out.println();
        for (Element e : b.getElements()){
            ((Visitee) e).accept(this);
        }
    }
    public void visitSection(Section s){
        System.out.println("Section: " + s.getTitle());
        for (Element e : s.getElements()){
            ((Visitee) e).accept(this);
        }
    }
    public void visitTOC(TableOfContents toc){
        System.out.println("Table of Contents: " + toc.getTOC());
    }
    public void visitParagraph(Paragraph p){
        int poz = 0;
        String text = p.getText();
        AlignStrategy alignStrategy = p.getAlignStrategy();
        while (poz < text.length()){
            int mx = Math.min(text.substring(poz).length(), 20);
            System.out.println(alignStrategy.align(text.substring(poz, poz + mx)));
            poz += mx;
        }
    }
    public void visitImageProxy(ImageProxy imgPr){
        ((Visitee) imgPr.loadImage()).accept(this);
    }
    public void visitImage(Image img){
        BufferedImage bufferedImage = img.content().getImage();
        if (bufferedImage != null){
            JLabel picLabel = new JLabel(new ImageIcon(bufferedImage));
            JPanel jPanel = new JPanel();
            jPanel.add(picLabel);
            JFrame f = new JFrame();
            f.setSize(new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight()));
            f.add(jPanel);
            f.setVisible(true);
        }
    }
    public void visitTable(Table t){
        System.out.println("Rows: " + t.getRows() + "\nColumns:" + t.getCols());
    }
}