package RO.UVT.SABLOANE;

import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {
    private String name;
   private Collection<Element> elements= new ArrayList<Element>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        elements.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        elements.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        elements.add(new Table(title));
    }

    public void print() {
        System.out.println("Subchapter name: " + this.name);

        System.out.println("Elements:");
        for(Element i : elements) {
            i.print();
        }

    }
}
