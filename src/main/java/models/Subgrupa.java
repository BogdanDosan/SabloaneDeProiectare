package models;
import java.util.*;

public class Subgrupa implements Element, Visitee{
    private String numeSubgrupa;
    private List<Element> studenti = Arrays.asList(new Student[15]);

    public Subgrupa(String nume){
        numeSubgrupa = nume;
    }

    public void accept(Visitor visitor){
        visitor.visitSubgrupa(this);
    }

    @Override
    public void add(Element e) {
        studenti.add(e);
    }

    @Override
    public void remove(Element e) {
        studenti.remove(e);
    }

    @Override
    public Element get(int i) {
        return studenti.get(i);
    }
    public String getNumeSubgrupa(){
        return numeSubgrupa;
    }
    public List<Element> getElements(){
        return studenti;
    }

}