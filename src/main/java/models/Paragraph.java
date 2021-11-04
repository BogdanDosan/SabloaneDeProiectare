package models;

import services.AlignLeft;
import services.AlignStrategy;

public class Paragraph implements Element, Visitee{
    String text;
    AlignStrategy alignStrategy;

    public Paragraph(String txt){
        text = txt;
        alignStrategy = new AlignLeft();
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitParagraph(this);
    }
    public void setAlignStrategy(AlignStrategy as){
        alignStrategy = as;
    }

    public String getText() {
        return text;
    }
    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }
}