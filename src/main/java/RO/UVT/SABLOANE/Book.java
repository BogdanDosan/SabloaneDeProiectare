package RO.UVT.SABLOANE;



import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Book extends Element{
    private final Collection<Author> authors = new LinkedList<>();
    private final List<Chapter> chapters = new ArrayList<>();
    private final List<Element> elements = new ArrayList<>();
    private final String title;
    private final TableOfContents contents;

    public Book(String title){
        this.title = title;
        this.contents = new TableOfContents(chapters);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void removeAuthor(Author author){
        authors.remove(author);
    }

    public Collection<Author> getAuthors(){
        return authors;
    }

    public void addContent(Element element){
        elements.add(element);
    }

    public int createChapter(String cTitle){
        Chapter chapter = new Chapter(cTitle);
        chapters.add(chapter);
        int index = chapters.indexOf(chapter);
        contents.addContent(index, chapter);
        return index;
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }

    public void print(){
        System.out.println(this);

        for(Element element: elements){
            element.print();
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = " + title + '\n' +
                "authors=" + authors + '\n';
    }
}