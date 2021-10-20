package RO.UVT.SABLOANE;

import java.util.HashMap;
import java.util.List;

public class TableOfContents extends Element{
    private final HashMap<Integer, Chapter> contents = new HashMap<>();

    public TableOfContents(List<Chapter> chapters){
        chapters.forEach(chapter -> {
            contents.put(chapters.indexOf(chapter), chapter);
        });
    }

    public void addContent(int index, Chapter chapter){
        contents.put(index, chapter);
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "TableOfContents{" +
                "contents=" + contents +
                '}';
    }
}