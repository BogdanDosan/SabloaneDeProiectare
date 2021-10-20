package RO.UVT.SABLOANE;

import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {
    private final String name;
    private final Collection<Element> elements = new ArrayList<>();

    public SubChapter(String name){
        this.name = name;
    }

    public void createNewParagraph(String pTitle){
        createNewElement(new Paragraph(pTitle));
    }

    public void createNewImage(String iName){
        createNewElement(new Image(iName));
    }

    public void createNewTable(String tTitle){
        createNewElement(new Table(tTitle));
    }

    public void createNewElement(Element element){
        elements.add(element);
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "name='" + name + '\'' +
                ", elements=" + elements +
                '}';
    }
}
