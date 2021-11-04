package models;

public interface Element {
    default void add(Element e){
        throw new UnsupportedOperationException("Cannot add Element");
    }
    default void remove(Element e){
        throw new UnsupportedOperationException("Cannot remove Element");
    }
    default Element get(int i){
        throw new UnsupportedOperationException("");
    }
}