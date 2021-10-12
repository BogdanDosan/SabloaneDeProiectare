package RO.UVT.SABLOANE;


import java.util.ArrayList;
import java.util.LinkedList;


public class Book {
    private String title;
    private LinkedList<Author> authors = new LinkedList<Author>();
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        authors.addLast(author);
    }

    public int createChapter (String chapterName) {
        chapters.add(new Chapter(chapterName));
        return chapters.size()-1;
    }

    public LinkedList<Author> getAuthors() {
        return authors;
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
