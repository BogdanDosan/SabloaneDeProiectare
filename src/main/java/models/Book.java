package models;

import java.util.*;

public class Book extends Section implements  Visitee{
    final Collection<Author> authors = new ArrayList<>();

    public Book(String b_title){
        super(b_title);
    }

    public Book(String b_title, Author b_author){
        super(b_title);
        authors.add(b_author);
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitBook(this);
    }
    public void addAuthor(Author b_author){
        authors.add(b_author);
    }

    public Collection<Author> getAuthors(){
        return Collections.unmodifiableCollection(authors);
    }
}