package RO.UVT.SABLOANE;

public class Author {
    private final String name;

    public Author(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}