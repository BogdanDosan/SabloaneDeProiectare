package models;

public class Author {
    String name, surname;
    public Author(String author_name, String author_surname){
        name = author_name;
        surname = author_surname;
    }
    public void print(){
        System.out.print(name + " " + surname);
    }
}