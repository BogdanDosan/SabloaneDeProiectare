package RO.UVT.SABLOANE;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String name;
    private final List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name){
        this.name = name;
    }

    public int createSubChapter(String sCTitle){
        SubChapter subChapter = new SubChapter((sCTitle));
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", subChapters=" + subChapters +
                '}';
    }
}