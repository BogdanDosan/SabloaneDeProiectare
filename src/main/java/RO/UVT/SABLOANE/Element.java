package RO.UVT.SABLOANE;

public abstract class Element {
    public abstract void print();

    public void add(Element element){
        throw new UnsupportedOperationException();
    }

    public void remove(Element element){
        throw new UnsupportedOperationException();
    }

    public Element get(int index){
        throw new UnsupportedOperationException();
    }

    public abstract void setParent(Element element);
    public abstract Element getParent();
}