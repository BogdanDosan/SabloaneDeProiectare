package RO.UVT.SABLOANE;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
    private final String title;
    private List<Element> elements = new ArrayList<>();

    public Section(String title){
        this.title = title;
    }

    @Override
    public void add(Element element) {
        if(element.getParent() != null) {
            // de implementat setParent
            elements.add(element);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }

    @Override
    public void setParent(Element element) {

    }

    @Override
    public Element getParent() {
        return null;
    }

    @Override
    public void print() {
        System.out.println(this);

        for(Element element: elements){
            element.print();
        }
    }

    @Override
    public String toString() {
        return title;
    }
}