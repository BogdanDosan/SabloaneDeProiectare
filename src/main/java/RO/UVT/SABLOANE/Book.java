package RO.UVT.SABLOANE;

import java.util.Collection;
import java.util.LinkedList;

public class Book {
    private final String title;
    private final Collection<Author> authors = new LinkedList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    public Collection<Author> getAuthors() {
        return authors;
    }
}
