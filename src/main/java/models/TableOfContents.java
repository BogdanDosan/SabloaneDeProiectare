package models;

public class TableOfContents implements Element, Visitee{
    //    List<Section> sections = new ArrayList<>();
    String TOC;
    TableOfContents(String tc){
        TOC = tc;
    }
    public String getTOC(){return TOC;}
    @Override
    public void accept(Visitor visitor){
        visitor.visitTOC(this);
    }
}