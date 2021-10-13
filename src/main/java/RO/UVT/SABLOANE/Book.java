package RO.UVT.SABLOANE;


import java.util.*;


public class Book {
    private String title;
    private List<Author> authors = new LinkedList<Author>();
    private List<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public int createChapter (String chapterName) {
        chapters.add(new Chapter(chapterName));
        return chapters.size()-1;
    }

    public List getAuthors() {
        return Collections.unmodifiableList(authors);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print(){
        System.out.println("Book title: " + this.title);
        System.out.println("Authors: ");

        for(Author i : authors) {
            i.print();
        }

        System.out.println("Chapters: ");

        for(Chapter i : chapters) {
            i.print();
        }


    }

}
