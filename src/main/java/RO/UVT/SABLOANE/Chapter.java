package RO.UVT.SABLOANE;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subchapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        subchapters.add(new SubChapter(subChapterName));
        return subchapters.size()-1;
    }

    public SubChapter getSubChapter(int index) {
        return subchapters.get(index);
    }

    public void print() {
        System.out.println(this.name);
        System.out.println("Subchapters: ");
        for(SubChapter i : subchapters) {
            i.print();
        }
    }
}
