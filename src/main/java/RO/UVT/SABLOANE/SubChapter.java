package RO.UVT.SABLOANE;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Image> images = new ArrayList<Image>();
    private ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    private ArrayList<Table>  tables= new ArrayList<Table>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        paragraphs.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        images.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        tables.add(new Table(title));
    }

    public void print() {
        System.out.println("Subchapter name: " + this.name);

        System.out.println("Paragraphs:");
        for(Paragraph i : paragraphs) {
            i.print();
        }

        System.out.println("Images:");
        for(Image i : images) {
            i.print();
        }

        System.out.println("Tables:");
        for(Table i : tables) {
            i.print();
        }

    }
}
