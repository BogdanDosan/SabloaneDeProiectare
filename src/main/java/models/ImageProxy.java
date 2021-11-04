package models;

public class ImageProxy implements Element, Picture, Visitee{
    private final String url_;
    private Image realImage_;

    public ImageProxy(String url){
        url_ = url;
        realImage_ = null;
    }

    public Image loadImage(){
        if (realImage_ == null){
            realImage_ = new Image(url_);
        }
        return realImage_;
    }
    @Override
    public String url(){
        return url_;
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitImageProxy(this);
    }
}