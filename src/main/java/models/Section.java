package models;

import java.util.*;

public class Section implements Element, Visitee{
    protected String title;
    protected List<Element> elements = new ArrayList<>();

    public Section(String b_title) {
        title = b_title;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitSection(this);
    }

    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element get(int i) {
        return elements.get(i);
    }
    public String getTitle(){
        return title;
    }
    public List<Element> getElements(){
        return elements;
    }
}