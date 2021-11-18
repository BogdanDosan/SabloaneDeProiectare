package models;

import java.util.ArrayList;
import java.util.List;

public class An implements Element, Visitee{
    private String numeAn;
    private List<Element> grupe = new ArrayList<>();

    public An(String nume){
        numeAn = nume;
    }

    public void accept(Visitor visitor){
        visitor.visitAn(this);
    }

    @Override
    public void add(Element e) {
        grupe.add(e);
    }

    @Override
    public void remove(Element e) {
        grupe.remove(e);
    }

    @Override
    public Element get(int i) {
        return grupe.get(i);
    }
    public String getNumeAn(){
        return numeAn;
    }
    public List<Element> getElements(){
        return grupe;
    }

}
