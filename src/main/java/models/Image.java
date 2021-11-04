package models;

import services.ImageLoaderFactory;

import java.awt.*;

public class Image implements Element, Picture, Visitee {
    String url;
    PictureContent content_ = null;

    public Image(String imgUrl){
        url = imgUrl;
        content_ = ImageLoaderFactory.create(url).load(url);
    }
    @Override
    public String url(){
        return "";
    }
    @Override
    public Dimension dim(){
        return new Dimension(0, 0);
    }
    @Override
    public PictureContent content(){
        return content_;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitImage(this);
    }
}