package models;
import java.util.*;

public class Grupa implements Element, Visitee{
    private String numeGrupa;
    private List<Element> subgrupe = new ArrayList<>();

    public Grupa(String nume){
        numeGrupa = nume;
    }

    public void accept(Visitor visitor){
        visitor.visitGrupa(this);
    }

    @Override
    public void add(Element e) {
        subgrupe.add(e);
    }

    @Override
    public void remove(Element e) {
        subgrupe.remove(e);
    }

    @Override
    public Element get(int i) {
        return subgrupe.get(i);
    }
    public String getNumeGrupa(){
        return numeGrupa;
    }
    public List<Element> getElements(){
        return subgrupe;
    }

}
